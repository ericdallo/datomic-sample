(ns datomic-sample.core
  (:require
   [datomic.api :as d]))

(comment
  (def db-uri "datomic:dev://localhost:4334/sample")

  (d/create-database db-uri)

  (def conn (d/connect db-uri))

  @(d/transact conn [{:db/doc "Hello world"}]))
