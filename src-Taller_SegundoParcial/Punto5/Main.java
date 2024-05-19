package Punto5;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        int elementoBuscado = 6;

        Busqueda_Ternaria busqueda = new Busqueda_Ternaria();
        int resultado = busqueda.busquedaTernaria(elementoBuscado, arr, 0, arr.length - 1);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + resultado);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");
        }
    }
    
}
