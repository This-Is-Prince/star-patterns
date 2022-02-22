package src

import "fmt"

func Pattern_16() {
	row := 7
	column := 7
	symbol := "*"
	index := 0
	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if j == index {
				fmt.Print("\\")
			} else if j == column-1-index {
				fmt.Print("/")
			} else {
				fmt.Print(symbol)
			}
		}
		fmt.Println()
		index++
	}
}
