(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
;; (cond (nil? x) false (false? x) false :else true)
 (if (nil? x) false (if (false? x) false true))
  )



(defn abs [x]
  (if (< x 0) (* x -1) x)

  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false)
  )

(defn fizzbuzz [n]
  (cond (true? (divides? 15 n)) "gotcha!"
        (true? (divides? 5 n)) "buzz"
        (true? (divides? 3 n)) "fizz"
        :else ""
               )

  )

(defn teen? [age]
 ;; (if (<= age 19) (if (>= age 13) true false) false)
  (if (>= 19 age 13) true false)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
   (cond (number? x) (* x 2)
         (empty? x) nil
         (list? x) (* (count x) 2)
         (vector? x) (*(count x) 2)
         :else true )
  )

(defn leap-year? [year]
 (cond (true? (divides? 400 year)) true
       (true? (divides? 100 year)) false
       (true? (divides? 4 year)) true
       :else false
  )
 ; (if (true? (divides? 400 year)) true (if (true? (divides? 4 year)) (if (true? (divides? 100 year)) true false) false )   )
  )

; '_______'
