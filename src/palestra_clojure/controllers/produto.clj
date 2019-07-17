(ns palestra-clojure.controllers.produto
  (:require [palestra-clojure.logic.produto :as logic]
            [palestra-clojure.db.produto :as db]))

(defn listar-produtos-disponiveis []
  (let [produtos (db/buscar)]
    (logic/remover-produtos-esgotados produtos)))
