package in_java;

public class Pattern_23 extends Pattern {
    public Pattern_23(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int symbol = 1;

        for (int i = 0; i < this.row; i++) {
            symbol = 1;

            for (int j = 0; j < this.column; j++) {
                if (j <= i) {
                    System.out.print(symbol);
                    if (symbol == 1) {
                        symbol = 0;
                    } else {
                        symbol = 1;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
