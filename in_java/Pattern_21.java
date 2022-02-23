package in_java;

public class Pattern_21 extends Pattern {
    public Pattern_21(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (j >= this.row - 1 - i && j <= this.column - 1 - i) {
                    System.out.print(this.symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
