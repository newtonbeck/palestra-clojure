(ns palestra-clojure.main
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn listar-produtos [request]
  {:status 200 :headers {"Content-type" "application/json"} :body {:id 1 :nome "iPhone"}})

(defroutes app-routes
  (GET "/produtos" request (listar-produtos request))
  (route/not-found "<h1>Page not found</h1>"))

(def handler (-> app-routes wrap-json-response))

(defn -main []
  (run-jetty handler {:port 3000}))
