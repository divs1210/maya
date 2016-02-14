(ns maya.util)

(defn **
  "Returns a raised to the power b"
  [^double a ^double b]
  #?(:clj  (Math/pow a b)
     :cljs (js/Math.pow a b)))

(defn abs
  "Calculates the absolute value (magnitude) of a number.
  The absolute value of a number is always positive."
  [^double n]
  #?(:clj  (Math/abs n)
     :cljs (js/Math.abs n)))

(defn sin
  "Returns a numeric value between -1 and 1, which 
  represents the sine of the angle given in radians."
  [^double n]
   #?(:clj  (Math/sin n)
      :cljs (js/Math.sin n)))

(defn cos
  "Returns a numeric value between -1 and 1, which 
  represents the cosine of the angle given in radians."
  [^double n]
  #?(:clj  (Math/cos n)
     :cljs (js/Math.cos n)))

(defn tan
  "Returns a numeric value that represents the tangent 
  of the angle given in radians."
  [^double n]
  #?(:clj  (Math/tan n)
     :cljs (js/Math.tan n)))

(defn sinh
  "Returns a numeric value that represents the hyperbolic 
  sine of the angle given in radians."
  [^double n]
   #?(:clj  (Math/sinh n)
      :cljs (js/Math.sinh n)))

(defn cosh
  "Returns a numeric value that represents the hyperbolic 
  cosine of the angle given in radians."
  [^double n]
  #?(:clj  (Math/cosh n)
     :cljs (js/Math.cosh n)))

(defn tanh
  "Returns a numeric value that represents the hyperbolic
  tangent of the angle given in radians."
  [^double n]
  #?(:clj  (Math/tanh n)
     :cljs (js/Math.tanh n)))

(defn asin
  "The inverse of sin, returns the arc sine of a value. 
  This function expects the values in the range of -1 to 1 and 
  values are returned in the range -PI/2 to PI/2."
  [^double n]
   #?(:clj  (Math/asin n)
      :cljs (js/Math.asin n)))

(defn acos
  "The inverse of cos, returns the arc cosine of a value. 
  This function expects the values in the range of -1 to 1 and 
  values are returned in the range 0 to PI (3.1415927)."
  [^double n]
  #?(:clj  (Math/acos n)
     :cljs (js/Math.acos n)))

(defn atan
  "The inverse of tan, returns the arc tangent of a value. 
  This returned value is in the range -PI/2 to PI/2."
  [^double n]
  #?(:clj  (Math/atan n)
     :cljs (js/Math.atan n)))
