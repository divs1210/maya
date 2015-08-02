# maya

A Clojure DSL for math and numeric work

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
