(ns palestra-clojure.controllers.produto-test
  (:require [clojure.test :refer :all]
            [palestra-clojure.controllers.produto :as controller-produto]
            [palestra-clojure.db.produto :as db-produto]
            [mock-clj.core :refer :all]))

(deftest listar-produtos
  (with-mock [db-produto/buscar {:id    1
                                 :nome  "Macbook"
                                 :valor 10000}]
             (is (= (controller-produto/listar-produtos)
                    {:id    1
                     :nome  "Macbook"
                     :valor 10000}))))
