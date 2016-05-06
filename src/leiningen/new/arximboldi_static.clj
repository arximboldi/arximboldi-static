(ns leiningen.new.arximboldi-static
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "arximboldi-static"))

(defn arximboldi-static
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' arximboldi-static project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
