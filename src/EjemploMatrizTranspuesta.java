public class EjemploMatrizTranspuesta {
    public static void main(String[] args) {


        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
     /*   for (int i= 0;i< matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }*/
        System.out.println("Matirz original");
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                int auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        System.out.println("\n" + "Matriz transpuesta");
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
    }
}
