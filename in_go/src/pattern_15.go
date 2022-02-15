package src

import "fmt"

func Pattern_15() {
	row := 9
	column := 5
	var symbol int
	halfRow := row / 2

	for i := 0; i < row; i++ {
		symbol = 1
		for j := 0; j < column; j++ {
			if i <= halfRow {
				if j >= column-1-i {
					fmt.Print(symbol)
					symbol++
				} else {
					fmt.Print(" ")
				}
			} else {
				if j >= i-column+1 {
					fmt.Print(symbol)
					symbol++
				} else {
					fmt.Print(" ")
				}
			}
		}
		fmt.Println()
	}
}
