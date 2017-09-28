(defproject reagent-leaflet-example "0.1.0"
  :description "Reagent LeafletJS component"
  :dependencies [[org.clojure/clojurescript "1.9.908"]
                 [reagent                   "0.7.0"]
                 [reagent-leaflet           "0.1.0-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]

                ;; The presence of a :figwheel configuration here
                ;; will cause figwheel to inject the figwheel client
                ;; into your build
                :figwheel {:open-urls ["http://localhost:3447/index.html"]}

                :compiler {:main reagent.leaflet.example
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/example.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true
                           :preloads [devtools.preload]}}

               {:id "min"
                :source-paths ["src"]
                :compiler {:main leaflet.leaflet.example
                           :output-to "resources/public/js/compiled/example.js"
                           :optimizations :advanced
                           :pretty-print false}}]}


  :figwheel {:server-port 3447
             :nrepl-port  7003
             :nrepl-middleware ["cider.nrepl/cider-middleware"
                                "cemerick.piggieback/wrap-cljs-repl"]}
  :profiles {:dev {:dependencies
                   [[lein-figwheel           "0.5.13"]
                    [org.clojure/core.async  "0.3.443"]
                    [org.clojure/tools.nrepl "0.2.12"]
                    [com.cemerick/piggieback "0.2.2"]
                    [figwheel-sidecar        "0.5.13" :exclusions [org.clojure/core.async org.clojure/tools.reader]]
                    [cider/cider-nrepl       "0.15.1"]
                    [binaryage/devtools      "0.9.4"]]
                   :plugins [[lein-figwheel "0.5.13"]]}})
