(ns service_test
  (:require [clojure.test :refer :all]
            [palestra-clojure.service :as s]
            [mock-clj.core :refer :all]
            [ring.mock.request :as mock]
            [palestra-clojure.db.produto :as db-produto]))

(deftest produto-handler-test
  (with-mock
   [db-produto/buscar [{:id    1
                        :nome  "Macbook"
                        :valor 10000},
                       {:id    2
                        :nome  "Iphone"
                        :valor 9000}]]
   (is (= (s/handler (mock/request :get "/produtos"))
          {:status  200
           :headers {"Content-type" "application/json", "Content-Type" "application/json; charset=utf-8"}
           :body    "[{\"id\":1,\"nome\":\"Macbook\",\"valor\":10000},{\"id\":2,\"nome\":\"Iphone\",\"valor\":9000}]"}))))
