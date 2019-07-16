(ns palestra-clojure.service
  (:gen-class)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response]]
            [palestra-clojure.controllers.produto :as controller-produto]))

(defroutes app-routes
  (GET "/produtos"
    request
    {:status 200 :headers {"Content-type" "application/json"} 
     :body (controller-produto/listar-produtos)})
  (route/not-found "<h1>Page not found</h1>"))

(def handler (wrap-json-response app-routes))
