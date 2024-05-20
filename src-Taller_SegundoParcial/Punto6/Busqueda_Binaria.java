package Punto6;

public class Busqueda_Binaria {

    public int BusquedaBinaria(int[] arr, int n, int inicio, int fin){

        if(inicio > fin)
            return -1;
        
        int mitad = inicio + (fin - inicio) / 2;

        if(arr[mitad] == n){
            return mitad;
        }else if(n > arr[mitad]){
            return BusquedaBinaria(arr, n, mitad+1, fin);
        }else{
            return BusquedaBinaria(arr, n, inicio, mitad-1);
        }
        
    }


    public int busquedaBinariaIterativa(int[] arr, int n) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int mitad = inicio + (fin - inicio) / 2; // Evitar overflow

            if (arr[mitad] == n) {
                return mitad;
            } else if (arr[mitad] < n) {
                inicio = mitad + 1; 
            } else {
                fin = mitad - 1; 
            }
        }

        return -1;
    }
}
