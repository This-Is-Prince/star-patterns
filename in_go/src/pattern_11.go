package src

import "fmt"

func Pattern_11() {
	row := 9
	column := 5
	symbol := "*"
	halfRow := row / 2

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if i <= halfRow {
				if j <= i {
					fmt.Print(symbol)
				} else {
					fmt.Print(" ")
				}
			} else {
				tempI := row - 1 - i
				if j <= tempI {
					fmt.Print(symbol)
				} else {
					fmt.Print(" ")
				}
			}
		}
		fmt.Println()
	}
}
