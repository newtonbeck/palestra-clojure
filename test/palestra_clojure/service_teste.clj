(ns palestra-clojure.service_teste
  (:require [clojure.test :refer :all]
            [mock-clj.core :refer :all]
            [palestra-clojure.service :as s]
            [palestra-clojure.main :as main]
            [palestra-clojure.db.produto :as db-produto]
            [io.pedestal.test :as test]))

(def produtos-mock-db
  [{:id         1
    :nome       "Macbook"
    :valor      10000
    :quantidade 11},
   {:id         2
    :nome       "Iphone"
    :valor      9000
    :quantidade 0}])

(deftest produto-handler-test
  (with-mock
   [db-produto/buscar produtos-mock-db]
   (let [test-server (:io.pedestal.http/service-fn (main/cria-o-servidor))
         response (test/response-for test-server :get "/produtos-disponiveis")]
   (is 
    (= (:status response) 200)
    (= (:body response) "[{\"id\":1,\"nome\":\"Macbook\",\"valor\":10000,\"quantidade\":11}]")))))
