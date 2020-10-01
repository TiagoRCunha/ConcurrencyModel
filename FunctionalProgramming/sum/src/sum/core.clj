(ns sum.core
  (:require [clojure.core.reducers :as r]))

(defn parallel-sum [numbers]
  (r/fold + numbers))

(defn recursive-sum [numbers]
  (if (empty? numbers)
    0
    (+ (first numbers) (recursive-sum (rest numbers)))))

;; reduce takes three arguments a funtion, an initial value, and a collection
(defn reduce-sum [numbers]
  (reduce (fn [acc x] (+ acc x)) 0 numbers))

(defn reduce-sum-rewrite [numbers]
  (reduce #(+ %2 %1) 0 numbers))

;; reduce can takes no initial value, all Clojure functions has identity, in this case identity is 0
(defn sum [numbers]
  (reduce + numbers))

(defn apply-sum [numbers]
  (apply + numbers))
