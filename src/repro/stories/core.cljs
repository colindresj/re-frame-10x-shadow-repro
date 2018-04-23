(ns repro.stories.core
  (:require ;[day8.re-frame-10x.preload]
            [re-frame.trace :refer [trace-enabled?]]
            [reagent.core :as r]
            ["@storybook/react" :refer [storiesOf]]
            [repro.stories.counter :refer [counter re-com-counter]]))

(.log js/console "goog.DEBUG:" goog.DEBUG)
(.log js/console "re-frame.trace/trace-enabled?" trace-enabled?)

(-> (storiesOf "A counter written in CLJS" js/module)
    (.add "Plain reagent" #(r/as-element [counter]))
    (.add "With re-com" #(r/as-element [re-com-counter])))
