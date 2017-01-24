(ns bi-paper.core
  (:require [funimage.img :as img]
            [funimage.imagej :as ij]
            [funimage.imagej.ops :as ops]
            [funimage.img.shape :as shape])
  (:gen-class))

(defn -main
  ""
  [& args]
  (ij/save-img (funimage.imagej.ops.morphology/dilate (ij/open-img "/Users/timothystiles/git/clojure/bi-paper/resources/pollen.jpg") (shape/rectangle-shape 5)) "pollen-dilate-rect.png"))

(defn point-filter
  ""
  []
  (ij/save-img (img/threshold (funimage.imagej.ops.morphology/dilate (ij/open-img "/Users/timothystiles/git/clojure/bi-paper/resources/pollen.jpg") (shape/rectangle-shape 2)) 100) "pollen-point-filter.png"))

(defn dilate-spread
  []
  (map #(ij/save-img (funimage.imagej.ops.morphology/dilate (ij/open-img "/Users/timothystiles/git/clojure/bi-paper/resources/pollen.jpg") (shape/rectangle-shape %)) (str "pollen-dilate-rect-" % ".png")) (range 2 5)))

(defn erode-spread
  []
  (map #(ij/save-img (funimage.imagej.ops.morphology/erode (ij/open-img "/Users/timothystiles/git/clojure/bi-paper/resources/pollen.jpg") (shape/rectangle-shape %)) (str "pollen-erode-rect-" % ".png")) (range 2 5)))
