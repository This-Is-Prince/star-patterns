package in_java;

public class Pattern_10 extends Pattern {
    public Pattern_10(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int halfRow = this.row / 2;
        int tempI;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (i <= halfRow) {
                    if (j >= halfRow - i && j <= halfRow + i) {
                        System.out.print(this.symbol);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    tempI = row - 1 - i;
                    if (j >= halfRow - tempI && j <= halfRow + tempI) {
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
