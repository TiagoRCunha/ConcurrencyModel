(defproject translator "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.1.8"]]
  :repl-options {:init-ns translator.core}
  :main translator.core)
