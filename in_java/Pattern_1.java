package in_java;

public class Pattern_1 extends Pattern {

    public Pattern_1(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (j <= i) {
                    System.out.print(this.symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}