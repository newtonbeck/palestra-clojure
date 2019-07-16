(ns palestra-clojure.controllers.produto-teste
  (:require [clojure.test :refer :all]
            [palestra-clojure.controllers.produto :as controller-produto]
            [palestra-clojure.db.produto :as db-produto]
            [mock-clj.core :refer :all]))

(def produtos-mock-db
  [{:id         1
    :nome       "Macbook"
    :valor      10000
    :quantidade 1}])

(deftest listar-produtos-disponiveis
  (with-mock [db-produto/buscar produtos-mock-db]
             (is (= (controller-produto/listar-produtos-disponiveis)
                    produtos-mock-db))))
