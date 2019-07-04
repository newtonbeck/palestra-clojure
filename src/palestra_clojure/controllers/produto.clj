(ns palestra-clojure.controllers.produto
  (:require [palestra-clojure.db.mysql.produto :as db-produto]))

(defn listar-produtos [request]
  (db-produto/buscar-no-banco))
