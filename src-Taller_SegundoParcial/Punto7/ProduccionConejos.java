package Punto7;

public class ProduccionConejos {

    // 1 pareja = 1 pareja * mes (Rwporduccion)
    // Fertilidad = 2 meces
    // No muere, reproduccion continua

    /*
     * (Mes 0) = 1; pareja A / 
     * (Mes 2) = 2; pareja B / Hijos de A
     * (Mes 3) = 3; pareja C / Hijos de A
     * (Mes 4) = 5; Pareja D, E / Hijos de A, B
     * (Mes 6) = 8; 
     * (Mes 7) = 13;
     */

     public int tabulacion(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 1;
        }
                    
        int[] arr = new int[n+1];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1]+arr[i-2]; 
        }

        return arr[n];
     }

     public int iterativa(int n){

        int suma = 0;

        if (n == 0){
            return 1;
        }else if (n == 1){
            return 1;
        }else{
            int a=1;
            int b=1;
            for(int i=2; i<=n; i++){
                suma = a + b;
                a = b;
                b = suma;
            }
        }

        return suma;
     }


}
