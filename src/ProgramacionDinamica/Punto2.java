package ProgramacionDinamica;

public class Punto2 {

    public int recursivo(int n){
        
        if (n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n == 2){
            return 1;
        }else if (n > 2){
            return recursivo(n-1)*n;
        }

        return 0;
    }

    public int iterativo(int n){

        int valor = 0;
        if (n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n == 2){
            return 1;
        }else if (n > 2){
            int b = 1;
            for (int i = 3; i<=n; i++){
                valor = b*i;
                b = valor;
            }
            return valor;
        }
        return valor;
    } 
    
    public int tabulacion(int n){

        if (n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n == 2){
            return 1;
        }
        
        int[] dp = new int[n+1];
        dp[0] = 3;
        dp[1] = 2;
        dp[2] = 1;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]*i; // Posicion, no valor
        }

        return dp[n];
    }

    private int[] memo;

    public int memorizacion(int n){
        memo = new int[n+1];
        return memo(n);
    }

    private int memo(int n){
        if (n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n == 2){
            return 1;
        }else if (memo[n] > 2){
            return memo[n];
        }

        memo[n] = memo(n-1) * n;
        return memo[n];
    }

}
