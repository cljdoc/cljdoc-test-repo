(ns foo.foo
  "v1.0.2 foo foo test namespace")

(defn exec
  "v1.0.2 Invoke me with clojure -X foo.foo/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "v1.0.2 - Invoke me with clojure -M -m foo.foo"
  [& args]
  (println "-main with" args))
