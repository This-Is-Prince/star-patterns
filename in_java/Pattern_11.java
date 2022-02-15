package in_java;

public class Pattern_11 extends Pattern {
    public Pattern_11(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int halfRow = this.row / 2;
        int tempI;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (i <= halfRow) {
                    if (j <= i) {
                        System.out.print(this.symbol);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    tempI = row - 1 - i;
                    if (j <= tempI) {
                        System.out.print(this.symbol);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
