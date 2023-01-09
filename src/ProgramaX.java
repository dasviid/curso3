import java.util.Scanner;

public class ProgramaX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = scanner.nextInt();
        String[][] x = new String[n][n];

        if (n == 0){
            System.out.println("ERROR");
        System.exit(1);
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == j || n-i-1 == j) {
                    x[i][j] = "x";
                    continue;
                }
                x[i][j] = "_";
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
