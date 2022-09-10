(ns foo.foo
  "foo foo test namespace")

(defn exec
  "Invoke me with clojure -X foo.foo/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "Invoke me with clojure -M -m foo.foo"
  [& args]
  (println "-main with" args))
