public class EjemploMatricesTransponerMatrices {
    public static void main(String[] args) {

        int[][] a, b;
        a = new int[8][4];
        b = new int[4][8];

        System.out.println("Matriz original" + "\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j * 3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("\n" + "Matriz transpuesta" + "\n");
        for (int[] fila : b) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
    }
}

