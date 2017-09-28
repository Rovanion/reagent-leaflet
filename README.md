# Reagent Leaflet #

Simple ClojureScript example for using LeafletJS maps as Reagent components.

```
(ns your-ns.map
  (:require [reagent.leaflet :as leaf]))

```

## Example project ##

Clone this project, cd into example and run `lein figwheel`.

## TODO ##

This is work in progress.

* no externs yet (not tested in advanced compilation mode)
* support more options
* support more geometry types and geometry options (color, bind popups, etc)
* support more events
* unmount behaviour (cleanup when map is being removed from DOM)
* turn this into a proper library and push it to clojars
* plethora of other stuff...
