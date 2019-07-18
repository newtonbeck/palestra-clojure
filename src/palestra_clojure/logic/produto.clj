(ns palestra-clojure.logic.produto)

(defn produto-disponivel?
  [produto]
  (not (= (get produto :quantidade) 0)))

(defn remover-produtos-esgotados
  [produtos]
  (filter produto-disponivel? produtos))
