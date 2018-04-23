(ns repro.stories.counter
  (:require [reagent.core :as r]
            [re-com.core :refer [button]]))

(defonce count-num (r/atom 0))

(def count-inc #(swap! count-num inc))

(defn counter []
  [:button {:on-click count-inc}
   @count-num])

(defn re-com-counter []
  [button
   :on-click count-inc
   :label    (str @count-num)])
