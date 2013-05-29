(ns spaz.views.comics
  (:require [spaz.views.common :as common])
  (:use [spaz.models.comics :as comics]))

(defpage "/comics" []
         (common/layout [:h2 "Comics!"]
                        [:h3 "lent out that you'll probably never get back"]
                        [:p (comic-list comics/all)]))

(defpartial comic [{:keys [name person when]}]
            [:tr
             [:td name]
             [:td person]
             [:td when]])

(defpartial comic-list [comics]
            [:table.table.table-striped
             [:thead
              [:tr
               [:th "The Fucker"]
               [:th "The Comic"]
               [:th "When you started hating them"]]]
             (map comic comics)])
