(ns palestra-clojure.service
  (:gen-class)
  (:require [io.pedestal.http.route.definition.table :as table]
            [palestra-clojure.controllers.produto :as controller]))

(defn listar-produtos-disponiveis [request]
  {:status  200
   :body    (controller/listar-produtos-disponiveis)
   :headers {"Content-Type" "application/json"}})

(def rotas
  (table/table-routes
   [["/produtos-disponiveis" :get listar-produtos-disponiveis :route-name :listar-produtos-disponiveis]]))
