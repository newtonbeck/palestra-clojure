(ns palestra-clojure.main
  (:gen-class)
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [palestra-clojure.service :as service]))

(defn -main []
  (run-jetty service/handler {:port 3000}))