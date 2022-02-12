package in_java;

public class Pattern_1 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        String symbol = "*";

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j <= i) {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }
}