package in_java;

public class Pattern_9 extends Pattern {
    public Pattern_9(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        char symbol = this.symbol.charAt(0);
        for (int i = 0; i < this.row; i++) {
            symbol = this.symbol.charAt(0);
            for (int j = 0; j < this.column; j++) {
                if (j <= row - 1 - i || j >= row - 1 + i) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
                if (j < row - 1) {
                    symbol++;
                } else {
                    symbol--;
                }
            }
            System.out.println();
        }
    }
}
