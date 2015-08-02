(ns maya.core-test
  (:require [clojure.test :refer :all]
            [maya.core :refer :all]))

(deftest a-test
  (testing "maya"
    (is (= (maya 1 + 5 :as six, six * 2 :as twelve, twelve / 3 * 2)
           8))))
