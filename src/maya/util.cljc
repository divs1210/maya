(ns maya.util)

(defn **
  "Returns a raised to the power b"
  [^double a ^double b]
  #?(:clj  (Math/pow a b)
     :cljs (js/Math.pow a b)))
