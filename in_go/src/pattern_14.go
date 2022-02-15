package src

import "fmt"

func Pattern_14() {
	row := 7
	column := 7
	var symbol int

	for i := 0; i < row; i++ {
		symbol = row - 1 - i
		for j := 0; j < column; j++ {
			if j <= column-1-i {
				fmt.Print(symbol)
				symbol--
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
