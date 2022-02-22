package src

import (
	"fmt"
)

func Pattern_20() {
	row := 4
	column := 8
	var firstSymbol rune = 65
	var secondSymbol rune = 1
	halfColumn := column / 2

	for i := 0; i < row; i++ {
		firstSymbol = 65
		secondSymbol = 1
		for j := 0; j < column; j++ {
			if j >= halfColumn-1-i && j <= halfColumn+i {
				if j < halfColumn {
					fmt.Print(string(firstSymbol))
					firstSymbol++
				} else {
					fmt.Print(secondSymbol)
					secondSymbol++
				}
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}
}
