(defproject automagic-tools-milestones "0.1.4"
  :description "Milestones : the Automagic Project Tasks Scheduler"
  :url "http://turbopape.github.io/milestones"
  :license {:name "MIT" 
            :url "http://opensource.or g/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/math.combinatorics "0.1.1"]
                 [aysylu/loom "0.5.4"]
                 [expectations "2.0.9"]]
  :scm {:name "git"
        :url "https://github.com/turbopape/milestones.git"}
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-expectations "0.0.8"]]}})
