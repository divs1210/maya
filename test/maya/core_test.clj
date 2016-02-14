(ns maya.core-test
  (:require [clojure.test :refer :all]
            [maya.core :refer :all]
            [maya.util :refer :all]))

(deftest a-test
  (testing "maya"
    (is (== (|> 1 + 5 :as six, 
                six ** 2 :as thirty-six, 
                thirty-six / 3)
            12))))

