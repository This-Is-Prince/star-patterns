package src

import "fmt"

func Pattern_6() {
	row := 5
	column := 9
	symbol := "*"
	toggle := false

	for i := 0; i < row; i++ {
		toggle = true
		for j := 0; j < column; j++ {
			if j >= row-1-i && j <= row-1+i && toggle {
				toggle = false
				fmt.Print(symbol)
			} else {
				toggle = true
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
