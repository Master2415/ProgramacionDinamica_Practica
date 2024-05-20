package Punto6;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 35, 40, 45, 50, 60, 65, 70, 90};
        int n = 40;

        Busqueda_Binaria busqueda_Binaria = new Busqueda_Binaria();
        int resultado = busqueda_Binaria.BusquedaBinaria(arr, n, 0, arr.length-1);

        if (resultado != -1) {
            System.out.println("El elemento " + n + " se encuentra en la posición " + resultado);
        } else {
            System.out.println("El elemento " + n + " no se encuentra en el arreglo.");
        }
    }
    
}
