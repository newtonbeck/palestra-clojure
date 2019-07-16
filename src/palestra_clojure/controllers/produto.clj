(ns palestra-clojure.controllers.produto
  (:require [palestra-clojure.logic.produto :as logic-produto]
            [palestra-clojure.db.produto :as db-produto]))

(defn lista-produtos-disponiveis []
  (let [produtos (db-produto/busca)]
    (logic-produto/remove-produtos-esgotados produtos)))
