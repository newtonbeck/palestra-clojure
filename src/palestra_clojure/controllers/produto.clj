(ns palestra-clojure.controllers.produto
  (:require [palestra-clojure.db.produto :as db-produto]))

(defn listar-produtos []
  (db-produto/buscar))
