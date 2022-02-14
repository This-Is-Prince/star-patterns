package src

import "fmt"

func Pattern_10() {
	row := 9
	column := 9
	symbol := "*"
	halfRow := row / 2

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			if i <= halfRow {
				if j >= halfRow-i && j <= halfRow+i {
					fmt.Print(string(symbol))
				} else {
					fmt.Print(" ")
				}
			} else {
				tempi := row - 1 - i
				if j >= halfRow-tempi && j <= halfRow+tempi {
					fmt.Print(string(symbol))
				} else {
					fmt.Print(" ")
				}
			}
		}
		fmt.Println()
	}
}
