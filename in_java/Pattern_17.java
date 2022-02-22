package in_java;

public class Pattern_17 extends Pattern {
    public Pattern_17(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int index = 0;
        int halfRow = this.row / 2;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (j > halfRow - index && j < halfRow + index) {
                    System.out.print(" ");
                } else {
                    System.out.print(this.symbol);
                }
            }
            if (i < halfRow) {
                index++;
            } else {
                index--;
            }
            System.out.println();
        }
    }
}
