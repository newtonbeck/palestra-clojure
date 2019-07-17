(ns palestra-clojure.logic.produto)

(defn produtos-nao-esgotados
  [produto]
  (not (= (get produto :quantidade) 0)))

(defn remover-produtos-esgotados
  [produtos]
  (filter produtos-nao-esgotados produtos))
