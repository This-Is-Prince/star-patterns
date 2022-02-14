package in_java;

public class Pattern_6 extends Pattern {

    public Pattern_6(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        boolean toggle = false;
        for (int i = 0; i < this.row; i++) {
            toggle = true;
            for (int j = 0; j < this.column; j++) {
                if (j >= row - 1 - i && j <= row - 1 + i && toggle) {
                    toggle = false;
                    System.out.print(this.symbol);
                } else {
                    toggle = true;
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
