(defproject transcripthandler "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 [clj-http "3.10.2"]]
  :repl-options {:init-ns server.core}
  :main server.core)
