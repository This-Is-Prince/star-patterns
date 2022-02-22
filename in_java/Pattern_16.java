package in_java;

public class Pattern_16 extends Pattern {
    public Pattern_16(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        int index = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (j == index) {
                    System.out.print("\\");
                } else if (j == this.column - 1 - index) {
                    System.out.print("/");
                } else {
                    System.out.print(this.symbol);
                }
            }
            index++;
            System.out.println();
        }
    }
}
