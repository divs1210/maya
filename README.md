# maya

## A Clojure DSL for math and numeric work

Leiningen: `[maya "1.0.0-SNAPSHOT"]`
Read the [introductory blog-post](http://pizzaforthought.blogspot.in/2015/01/maya-dsl-for-math-and-numerical-work.html).

## Usage

```clojure
(defn quadratic [a b c]
  (maya 4 * a * c :as d,
        b * b - d Math/pow 0.5 :as D,
        2 * a :as t, (- b) :as -b,
        -b + D / t :as x1,
        -b - D / t :as x2,
    [x1 x2]))
```

## License

Copyright © 2015 Divyansh Prakash

Distributed under the Eclipse Public License version 1.0
