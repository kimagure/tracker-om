(defproject tracker-om "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2657"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [om "0.8.0-rc1"]]

  :plugins [[lein-cljsbuild "1.0.4"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/tracker_om" "tracker_om.js"]

  :cljsbuild {
    :builds [{:id "tracker-om"
              :source-paths ["src"]
              :compiler {
                :output-to "tracker_om.js"
                :output-dir "out"
                :optimizations :none
                :cache-analysis true
                :source-map true}}]})
