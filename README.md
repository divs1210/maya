# maya

## A Clojure DSL for math and numeric work

Leiningen: `[maya "1.0.0-SNAPSHOT"]`
Read the [introductory blog-post](http://pizzaforthought.blogspot.in/2015/01/maya-dsl-for-math-and-numerical-work.html).

## Usage
Expressions are always evaluated from left to right.
```clojure
(require '[maya.core :refer :all]
         '[maya.util :refer :all])

(defn quadratic 
  [^double a ^double b ^double c]
  (|> 4 * a * c :as d,
      b * b - d ** 0.5 :as D,
      2 * a :as t, (- b) :as -b,
     -b + D / t :as x1,
     -b - D / t :as x2,
    [x1 x2]))

(quadratic 1 2 -3) ;=> [1.0 -3.0]
```

## License

Copyright © 2015 Divyansh Prakash

Distributed under the Eclipse Public License version 1.0
