(ns palestra-clojure.main
  (:gen-class)
  (:require [io.pedestal.http :as http]
            [palestra-clojure.service :as service]))

(defn cria-o-servidor []
  (http/create-server
    {::http/routes  service/rotas
    ::http/type     :jetty
    ::http/port     3000}))

(defn -main []
  (http/start (cria-o-servidor)))
