(ns palestra-clojure.logic.produto)

(defn get-quantidade
  [produto]
  (:quantidade produto))

(defn esgotado?
  [produto]
  (= (get-quantidade produto) 0))

(defn remove-produtos-esgotados
  [produtos]
  (filter #(not (esgotado? %)) produtos))
