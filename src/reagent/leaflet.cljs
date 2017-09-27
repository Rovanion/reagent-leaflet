(ns reagent.leaflet
  (:require [reagent.core         :as reagent]
            [reagent.leaflet.core :as core]))


(defn create-shape [m]
  "Create a LeafletJS shape."
  (core/create-shape m))


(defn leaflet [mapspec]
  "A LeafletJS map component."
  (reagent/create-class
    {:get-initial-state (fn [_] {:mapspec mapspec})
     :component-did-mount core/leaflet-did-mount
     :component-will-update core/leaflet-will-update
     :render core/leaflet-render}))
