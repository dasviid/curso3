import java.util.Scanner;

public class ProgramaSilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de h");
        int h = scanner.nextInt();
        int[][] x = new int[h][h];

        if (h<3){
            System.out.println("ERROR");
        System.exit(1);
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j == 0 || i == (h/2)|| (i > h/2 && j ==h-1)) {
                    x[i][j] = 1;
                }
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
