package in_java;

public class Pattern_19 extends Pattern {
    public Pattern_19(int row, int column, String symbol) {
        super(row, column, symbol);
    }

    public void print() {
        byte symbol = (byte) this.symbol.charAt(0);
        int halfColumn = this.column / 2;
        for (int i = 0; i < this.row; i++) {
            symbol = (byte) this.symbol.charAt(0);
            for (int j = 0; j < this.column; j++) {
                if (j >= halfColumn - i && j <= halfColumn + i) {
                    System.out.print((char) symbol);
                    if (j < halfColumn) {
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
