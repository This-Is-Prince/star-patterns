package src

import (
	"fmt"
)

func Pattern_23() {
	row := 6
	column := 6
	symbol := 1

	for i := 0; i < row; i++ {
		symbol = 1
		for j := 0; j < column; j++ {
			if j <= i {
				fmt.Print(symbol)
				if symbol == 0 {
					symbol = 1
				} else {
					symbol = 0
				}
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
