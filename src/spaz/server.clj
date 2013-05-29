(ns spaz.server
  (:require [noir.server :as server]
            [spaz.models :as models]))

(server/load-views-ns 'spaz.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'spaz})))

