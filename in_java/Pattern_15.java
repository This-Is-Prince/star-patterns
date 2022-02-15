package in_java;

public class Pattern_15 extends Pattern {
    public Pattern_15(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int startingSymbol = Integer.parseInt(this.symbol);
        int symbol;
        int halfRow = this.row / 2;
        for (int i = 0; i < this.row; i++) {
            symbol = startingSymbol;
            for (int j = 0; j < this.column; j++) {
                if (i <= halfRow) {
                    if (j >= this.column - 1 - i) {
                        System.out.print(symbol);
                        symbol++;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - this.column + 1) {
                        System.out.print(symbol);
                        symbol++;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
