public class EjemploMatrizMarco {
    public static void main(String[] args) {
        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || i == a.length - 1 || j == 0 || j == a.length - 1) {
                    a[i][j] = 1;
                }
            }
        }
        System.out.println("Matriz transpuesta" + "\n");
        for (int[] fila : a) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
    }
}
