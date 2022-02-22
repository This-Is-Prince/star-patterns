package src

import "fmt"

func Pattern_17() {
	row := 9
	column := 9
	symbol := "*"
	index := 0
	halfRow := row / 2

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if j > halfRow-index && j < halfRow+index {
				fmt.Print(" ")
			} else {
				fmt.Print(symbol)
			}
		}
		if i < halfRow {
			index++
		} else {
			index--
		}
		fmt.Println()
	}
}
