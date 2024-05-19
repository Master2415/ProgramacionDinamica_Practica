package Punto5;

public class Busqueda_Ternaria {

    public int busquedaTernaria(int n, int[] arr, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // El elemento no está en el arreglo
        }

        int tercio1 = inicio + (fin - inicio) / 3;
        int tercio2 = inicio + 2 * (fin - inicio) / 3;

        if (arr[tercio1] == n) {
            return tercio1; // Se encontró el elemento en el tercio1
        } else if (arr[tercio2] == n) {
            return tercio2; // Se encontró el elemento en el tercio2
        } else if (n < arr[tercio1]) {
            // Buscar en el subarreglo izquierdo
            return busquedaTernaria(n, arr, inicio, tercio1 - 1);
        } else if (n > arr[tercio2]) {
            // Buscar en el subarreglo derecho
            return busquedaTernaria(n, arr, tercio2 + 1, fin);
        } else {
            // Buscar en el subarreglo central
            return busquedaTernaria(n, arr, tercio1 + 1, tercio2 - 1);
        }
    }
    
}
