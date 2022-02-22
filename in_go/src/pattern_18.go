package src

import "fmt"

func Pattern_18() {
	row := 5
	column := 9
	symbol := "*"

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if j >= i && j <= column-1-i {
				fmt.Print(symbol)
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
