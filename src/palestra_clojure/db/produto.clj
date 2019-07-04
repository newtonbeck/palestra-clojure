(ns palestra-clojure.db.produto
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec {
  :dbtype "mysql"
  :dbname "palestra"
  :user "root"
  :password "123"
  :host "localhost"
  :port 3306
})

(defn buscar []
  (jdbc/query db-spec ["select * from produto"]))
