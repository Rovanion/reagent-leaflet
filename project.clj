(defproject reagent-leaflet "0.1.0-SNAPSHOT"
  :description "Reagent LeafletJS component"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [reagent "0.7.0"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :cljsbuild {:builds [{:id "example"
                        :source-paths ["src"]
                        :compiler {:optimizations :none
                                   :source-map true
                                   :preamble ["reagent/react.js"]
                                   :output-to "resources/public/js/compiled/example.js"
                                   :output-dir "resources/public/js/compiled/out"}}]}

  :figwheel {:server-port 3447
             :nrepl-port  7003
             :nrepl-middleware ["cider.nrepl/cider-middleware"
                                "cemerick.piggieback/wrap-cljs-repl"]}
  :profiles {:dev {:dependencies
                   [[lein-figwheel           "0.5.13"]
                    [org.clojure/tools.nrepl "0.2.12"]
                    [com.cemerick/piggieback "0.2.2"]
                    [figwheel-sidecar        "0.5.13" :exclusions [org.clojure/core.async org.clojure/tools.reader]]
                    [cider/cider-nrepl       "0.15.1"]
                    [binaryage/devtools      "0.9.4"]]
                   :plugins [[lein-figwheel "0.5.13"]]}})
