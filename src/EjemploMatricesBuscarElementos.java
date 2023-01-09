public class EjemploMatricesBuscarElementos {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1642},
                {312, 654, 123, 543},
                {2, 31, 64, 96}
        };

        int elmentoBuscar = 1;
        boolean encontrado = false;
        int i = 0;
        int j = 0;
        filas:
        for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (elmentoBuscar == matrizDeEnteros[i][j]) {
                    encontrado = true;
                    break filas;
                }
            }
        }
        if (encontrado == true) {
            System.out.println("El elemento fue encontrado");
            System.out.println("Se lo encontro en la fila " + i + ", columna " + j);
        } else {
            System.out.println("El elemento no fue encontrado");
        }
    }
}
