package in_java;

public class Pattern_20 extends Pattern {
    public Pattern_20(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        byte firstSymbol = 65;
        byte secondSymbol = 1;
        int halfColumn = this.column / 2;

        for (int i = 0; i < this.row; i++) {
            firstSymbol = 65;
            secondSymbol = 1;
            for (int j = 0; j < this.column; j++) {
                if (j >= halfColumn - 1 - i && j <= halfColumn + i) {
                    if (j < halfColumn) {
                        System.out.print((char) firstSymbol);
                        firstSymbol++;
                    } else {
                        System.out.print(secondSymbol);
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
