(defproject oneday "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.slf4j/slf4j-log4j12 "1.7.25"]
                 [com.layerware/hugsql "0.4.9"]
                 [funcool/clojure.jdbc "0.9.0"]
                 [markdown-clj "1.0.5"]
                 [clj-http "3.9.1"]                 
                 [hiccup "1.0.5"]
                 [ring "1.7.1"]
                 [bidi "2.1.4"]
                 [cheshire "5.8.1"]                 
                 [org.postgresql/postgresql "42.2.2"]
                 [migratus "1.1.6"]]
  :plugins [[migratus-lein "0.6.7"]]
  :main ^:skip-aot oneday.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
