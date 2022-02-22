package src

import (
	"fmt"
)

func Pattern_19() {
	row := 4
	column := 7
	var symbol rune = 65
	halfColumn := column / 2

	for i := 0; i < row; i++ {
		symbol = 65
		for j := 0; j < column; j++ {
			if j >= halfColumn-i && j <= halfColumn+i {
				fmt.Print(string(symbol))
				if j < halfColumn {
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
