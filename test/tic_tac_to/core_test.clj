(ns tic-tac-to.core-test
  (:require [midje.sweet :refer :all]
            [tic-tac-to.core :refer :all]))

  
(fact "internal presentation should be 3 x 3 matrix"
      internal-board => [["-" "-" "-"]["-" "-" "-"]["-" "-" "-"]])

(fact "input 0"
      (input 0) => [["X" "-" "-"]["-" "-" "-"]["-" "-" "-"]])
(fact "input 1"
      (input 1) => [["-" "X" "-"]["-" "-" "-"]["-" "-" "-"]])
(fact "input 3"
      (input 3) => [["-" "-" "-"]["X" "-" "-"]["-" "-" "-"]])
(fact "input 8"
      (input 8) => [["-" "-" "-"]["-" "-" "-"]["-" "-" "X"]])
