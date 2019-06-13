(ns palestra-clojure.main
  (:gen-class))

(defn handler [request]
  {:status 200
    :headers {"Content-Type" "text/html"}
    :body "Hello World"})

(defn -main []
  (println "Hello world"))