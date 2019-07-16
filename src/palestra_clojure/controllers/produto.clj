(ns palestra-clojure.controllers.produto
  (:require [palestra-clojure.logic.produto :as logic-produto]
            [palestra-clojure.db.produto :as db-produto]))

(defn listar-produtos-disponiveis []
  (let [produtos (db-produto/buscar)]
    (logic-produto/remover-produtos-esgotados produtos)))
