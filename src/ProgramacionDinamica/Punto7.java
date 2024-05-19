package ProgramacionDinamica;

public class Punto7 {

    public int recursivo(int n, int k){

        if(k == 0){
            return 2*n+1;
        }else if(n == k){
            return recursivo(n-1, k-1)+5;
        }else if(0<k && k<n){
            return recursivo(n, k-1)*4 - 1;
        }else{
            return 0;
        }
 
    }

    public int tabulacion(int n, int k){

        // Aseguramos que k esté dentro de los límites válidos
        if (k < 0 || k > n) {
            return 0; // El valor de retorno en este caso según la lógica recursiva
        }

        int[][] arr = new int[n + 1][n + 1];

        // Llenado de la tabla siguiendo la lógica recursiva
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    arr[i][j] = 2 * i + 1;
                } else if (i == j) {
                    arr[i][j] = arr[i - 1][j - 1] + 5;
                } else {
                    arr[i][j] = arr[i][j - 1] * 4 - 1;
                }
            }
        }
        return arr[n][k];
    }

    public int memorizacion(int n, int k){

        int[][] memo = new int[n+1][k+1];

        if(k == 0){
            return 2*n+1;
        }else if(n == k){
            return memo[n][k] = recursivo(n-1, k-1)+5;
        }else if(0<k && k<n){
            return memo[n][k] = recursivo(n, k-1)*4 - 1;
        }else{
            return 0;
        }

    }
    
}
