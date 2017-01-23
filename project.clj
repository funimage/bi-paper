(defproject bi-paper "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/TimothyStiles/bi-paper" 
  :license {:name "Apache Software License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funimage "0.1.93"]]
  :repositories [["imagej-releases" "http://maven.imagej.net/content/repositories/releases/"]
                 ["imagej-snapshots" "http://maven.imagej.net/content/repositories/snapshots/"]]
  :main ^:skip-aot bi-paper.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
