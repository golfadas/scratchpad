(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2496"]]
  :plugins [[lein-cljsbuild "0.2.7"]]
  :source-paths ["src/clj"]
  :cljsbuild {
    :builds [{
      :source-path "src/cljs"
      :compiler {
        :output-to "resources/public/hello.js"
        :optimizations :whitespace
        :pretty-print true}}]} )
