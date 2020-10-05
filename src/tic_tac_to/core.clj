(ns tic-tac-to.core)

(def internal-board [["-" "-" "-"]["-" "-" "-"]["-" "-" "-"]])

(defn input [index]
  (assoc-in internal-board [(quot index 3) (rem index 3)] "X"))
