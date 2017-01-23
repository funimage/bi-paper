(ns bi-paper.core
  (:require [funimage.img :as img]
            [funimage.imagej :as ij]
            [funimage.imagej.ops :as ops]
            [funimage.img.shape :as shape])
  (:gen-class))

(defn -main
  ""
  [& args]
  (ij/show (funimage.imagej.ops.morphology/dilate (ij/open-img "/Users/timothystiles/git/clojure/bi-paper/resources/pollen.jpg") (shape/rectangle-shape 5))))

