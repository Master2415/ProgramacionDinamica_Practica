package ProgramacionDinamica;

public class TrianguloPascal {

    public int recursivo(int n, int k) {

        if (k == 0 || k == n){
            return 1;
        }else if(k>0 && n>k){
            return recursivo(n-1, k-1) + recursivo(n-1, k);
        }else{
            return 0;
        }       
    }

    public int iterativo(int n, int k) {

        int[][] dp = new int[n + 1][n + 1];

        // Caso base: k == 0 o k == n
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        // Llenar la matriz dp iterativamente
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[n][k];
    } 

    public int memorizacion(int n, int k){
        int[][] arr = new int[n+1][k+1];
        return memo(n, k, arr);
    }

    private int memo(int n, int k, int[][] arr){

        if(k == n || k == 0){
            return 1;
        }else if(arr[n][k] != 0){
            return arr[n][k]; 
        }

        if(k > 0 && k < n)
        arr[n][k] = memo(n-1, k-1, arr) + memo(n-1, k, arr);
        return arr[n][k];
    }
    
}
