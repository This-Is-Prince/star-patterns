package src

import "fmt"

func Pattern_2() {
	row := 5
	column := 5
	symbol := "*"

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if j >= row-1-i {
				fmt.Print(symbol)
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
