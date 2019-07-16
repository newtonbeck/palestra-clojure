(ns palestra-clojure.logic.produto-teste
  (:require [clojure.test :refer :all]
            [palestra-clojure.logic.produto :as logic-produto]
            [mock-clj.core :refer :all]))

(def produtos-db
  [{:id         1
    :nome       "Macbook"
    :valor      10000
    :quantidade 22},
   {:id         2
    :nome       "Iphone"
    :valor      10000
    :quantidade 33},
   {:id         3
    :nome       "Readmi note"
    :valor      1000
    :quantidade 0}])

(deftest remove-produtos-esgotados
  (is (= (logic-produto/remove-produtos-esgotados produtos-db)
         [{:id         1
           :nome       "Macbook"
           :valor      10000
           :quantidade 22},
          {:id         2
           :nome       "Iphone"
           :valor      10000
           :quantidade 33}])))
