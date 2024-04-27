package ProgramacionDinamica;

public class Punto4 {

    public int recursiva(int n, int k){

        if(n == k || k == 0){
            return 3;
        }else if(k > 0 && k < n){
            return recursiva(n, k-1) + recursiva(n-1, k) + 2;
        }else{
            return 0;
        }
    }

    public int tabulacion(int n, int k){
        // Solo sí 0 < k < n

        int[][] pp = new int[n+1][n+1];

        // Caso base: k == 0 o k == n
        for(int i = 0; i <= n; i++){
           pp[i][0] = 3; // (n, 0)
           pp[i][i] = 3; // (n, k)
        }
        
        for(int i = 2; i <= n; i++){ // comienza desde la tercera fila, filas anteriores = 3
            for(int j = 1; j < i; j++){ // comienza desde la segunda columna, columna 1 = 3
                pp[i][j] = pp[i][j - 1] + pp[i - 1][j] + 2; 
            }
        }

        return pp[n][k];
    }

    public int memorizacion(int n, int k){
        int[][] memo = new int[n+1][k+1];
        return memo(n, k, memo);
    }

    private int memo(int n, int k, int[][] memo){

        // Caso base: k == 0 ó k == n
        if(k == 0 || k == n){
            return 3;
        }else if (memo[n][k] != 0){
            return memo[n][k];
        }

        if(k > 0 && k < n){
            memo[n][k] = memo(n, k-1, memo) + memo(n-1, k, memo) + 2;
        }
         
        return memo[n][k];
    }


}
