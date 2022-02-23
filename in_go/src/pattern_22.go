package src

import (
	"fmt"
)

func Pattern_22() {
	row := 5
	column := 9
	var firstSymbol rune = 1
	var secondSymbol rune = 65
	halfColumn := column / 2

	for i := 0; i < row; i++ {
		firstSymbol = 1
		secondSymbol = 65
		for j := 0; j < column; j++ {
			if j >= halfColumn-i && j <= halfColumn+i {
				if j <= halfColumn {
					fmt.Print(firstSymbol)
					firstSymbol++
				} else {
					fmt.Print(string(secondSymbol))
					secondSymbol++
				}
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
