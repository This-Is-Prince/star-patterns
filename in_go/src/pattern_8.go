package src

import "fmt"

func Pattern_8() {
	row := 5
	column := 9
	symbol := 1

	for i := 0; i < row; i++ {
		symbol = 1
		for j := 0; j < column; j++ {
			if j >= row-1-i && j <= row-1+i {
				fmt.Print(symbol)
				if j < row-1 {
					symbol++
				} else {
					symbol--
				}
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
