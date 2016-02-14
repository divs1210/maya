(ns maya.core)

(defmacro |->
  "(|-> 1 + 5 * 2 / 3) ;=> (-> 1 (+ 5) (* 2) (/ 3)) ;=> 4"
  [exp & f-x-pairs]
  (if (even? (count f-x-pairs))
    `(-> ~exp
       ~@(for [[f x] (partition 2 f-x-pairs)]
           (list f x)))
    (throw (Exception. "f-x-pairs should be even."))))

(defmacro |>
  "(|> 1 + 5 :as six, six * 2 :as twelve, twelve / 3 * 2) ;=> 8"
  [& exprs]
  (let [[exp [_ ?as & next-exprs :as E]] (split-with #(not= :as %) exprs)]
    (if (empty? E)
      (cons `|-> exp)
      `(let [~?as (|-> ~@exp)]
         (|> ~@next-exprs)))))
