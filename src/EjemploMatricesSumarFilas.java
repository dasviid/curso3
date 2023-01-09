public class EjemploMatricesSumarFilas {
    public static void main(String[] args) {
        int sumaFilas, sumaColumnas;
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < a.length; i++) {
            sumaColumnas = 0;
            sumaFilas = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumaFilas += a[i][j];
                sumaColumnas += a[j][i];
            }
            System.out.print("Total fila " + i + ": " + sumaFilas + " ----");
            System.out.println(" Total columna " + i + ": " + sumaColumnas);
        }

    }
}