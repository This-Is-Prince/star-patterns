package src

import "fmt"

func Pattern_9() {
	row := 5
	column := 9
	var symbol uint8

	for i := 0; i < row; i++ {
		symbol = 65
		for j := 0; j < column; j++ {
			if j <= row-1-i || j >= row-1+i {
				fmt.Print(string(symbol))
			} else {
				fmt.Print(" ")
			}
			if j < row-1 {
				symbol++
			} else {
				symbol--
			}
		}
		fmt.Println()
	}
}
