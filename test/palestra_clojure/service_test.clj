(ns palestra-clojure.service_test
  (:require [clojure.test :refer :all]
            [mock-clj.core :refer :all]
            [ring.mock.request :as mock]
            [palestra-clojure.service :as s]
            [palestra-clojure.db.produto :as db-produto]))

(deftest produto-handler-test
  (with-mock
   [db-produto/busca [{:id         1
                       :nome       "Macbook"
                       :valor      10000
                       :quantidade 11},
                      {:id         2
                       :nome       "Iphone"
                       :valor      9000
                       :quantidade 0}]]
   (is (= (s/handler (mock/request :get "/produtos"))
          {:status  200,
           :headers {"Content-Type" "application/json; charset=utf-8"},
           :body    "[{\"id\":1,\"nome\":\"Macbook\",\"valor\":10000,\"quantidade\":11}]"}))))
