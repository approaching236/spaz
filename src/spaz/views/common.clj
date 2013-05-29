(ns spaz.views.common
  (:require [taoensso.carmine :as car])
  (:use [noir.core :only [defpartial]]
        [hiccup.page]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "spaz"]
               (include-js "bootstrap.js")
               (include-css "/css/bootstrap.css")]
              [:body
               [:h1 "Spaz"]
               [:div#wrapper
                content]]))
