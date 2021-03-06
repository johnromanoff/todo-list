(defproject todo-list "0.1.0-SNAPSHOT"
  :description "web app"
  :url "https://github.com/johnromanoff/todo-list"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.7.1"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [compojure "1.6.1"]]
  :main todo-list.core
  :profiles {:dev           
              {:main todo-list.core/-dev-main}})

