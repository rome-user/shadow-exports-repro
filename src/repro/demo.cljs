(ns repro.demo
  (:require ["B/src/one.js" :refer [bar]]
            ["B/src/two.js" :refer [baz]]))

(defn hello []
  (println "bar is" bar
           "baz is" baz))
