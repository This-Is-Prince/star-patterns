package in_java;

public class Pattern_22 extends Pattern {
    public Pattern_22(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int firstSymbol;
        int secondSymbol;
        int halfColumn = this.column / 2;

        for (int i = 0; i < this.row; i++) {
            firstSymbol = 1;
            secondSymbol = 65;

            for (int j = 0; j < this.column; j++) {
                if (j >= halfColumn - i && j <= halfColumn + i) {
                    if (j <= halfColumn) {
                        System.out.print(firstSymbol);
                        firstSymbol++;
                    } else {
                        System.out.print((char) secondSymbol);
                        secondSymbol++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
