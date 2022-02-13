package in_java;

public class Pattern_5 {
    int row, column;
    String symbol;

    public Pattern_5(int row, int column, String symbol) {
        this.row = row;
        this.column = column;
        this.symbol = symbol;
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (j >= row - 1 - i && j <= row - 1 + i) {
                    System.out.print(this.symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
