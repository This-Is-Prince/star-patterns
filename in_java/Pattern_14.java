package in_java;

public class Pattern_14 extends Pattern {
    public Pattern_14(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int symbol = Integer.parseInt(this.symbol);
        for (int i = 0; i < this.row; i++) {
            symbol = this.row - 1 - i;
            for (int j = 0; j < this.column; j++) {
                if (j <= this.column - 1 - i) {
                    System.out.print(symbol);
                    symbol--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
