package in_java;

public class Pattern_8 extends Pattern {

    public Pattern_8(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int symbol = Integer.parseInt(this.symbol);
        for (int i = 0; i < this.row; i++) {
            symbol = Integer.parseInt(this.symbol);
            for (int j = 0; j < this.column; j++) {
                if (j >= row - 1 - i && j <= row - 1 + i) {
                    System.out.print(symbol);
                    if (j < row - 1) {
                        symbol++;
                    } else {
                        symbol--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
