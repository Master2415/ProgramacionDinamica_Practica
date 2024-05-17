package ProgramacionDinamica;

public class Punto6 {

    public int recursivo(int n, int k){
        
        if(n == k || k == 0)
        return 2;
        else if (0 < k && k < n){
            return recursivo(n, k-1) + recursivo(n-1, k-1) + recursivo(n-1, k);
        }else {
            return 0;
        }
    }

    public int iterativo(int n, int k){

        
        // Solo sí 0 < k < n
        int[][] pp = new int[n+1][n+1];

        // Caso base: k == 0 o k == n
        for(int i = 0; i <= n; i++){
        pp[i][0] = 2; // (n, 0)
        pp[i][i] = 2; // (n, k)
        }
        
        
        for(int i = 2; i <= n; i++){ // comienza desde la tercera fila, filas anteriores = 2
            for(int j = 1; j < i; j++){ // comienza desde la segunda columna, columna 1 = 2
                pp[i][j] = pp[i][j-1] + pp[i-1][j-1] + pp[i-1][j]; 
            }
        }

        return pp[n][k];
        
    }

    public int tabular(int n, int k){

        
        if (k <= n){
            // Solo sí 0 < k < n
            int[][] pp = new int[n+1][n+1];

            // Caso base: k == 0 o k == n
            for(int i = 0; i <= n; i++){
            pp[i][0] = 2; // (n, 0)
            pp[i][i] = 2; // (n, k)
            }
            
            
            for(int i = 2; i <= n; i++){ // comienza desde la tercera fila, filas anteriores = 2
                for(int j = 1; j < i; j++){ // comienza desde la segunda columna, columna 1 = 2
                    pp[i][j] = pp[i][j-1] + pp[i-1][j-1] + pp[i-1][j]; 
                }
            }

            return pp[n][k];
        }
        
        // Valores no calculados
        return 0; 
        
    }

    public int memorizacion(int n, int k){
        int[][] memo = new int[n+1][n+1];
        return memo(n, k, memo);
    }

    private int memo(int n, int k, int[][] memo){

        if(n == k || k == 0)
        return 2;
        else if(memo[n][k] != 0){
            return memo[n][k]; 
        }
        memo[n][k] = memo(n, k-1, memo)+memo(n-1, k-1, memo)+memo(n-1, k, memo); 

        return memo[n][k];
    }



    
}
