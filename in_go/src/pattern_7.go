package src

import "fmt"

func Pattern_7() {
	row := 5
	column := 9
	symbol := "*"

	for i := 0; i < row; i++ {

		for j := 0; j < column; j++ {
			if j <= row-1-i || j >= row-1+i {

				fmt.Print(symbol)
			} else {

				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
