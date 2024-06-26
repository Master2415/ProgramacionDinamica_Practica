package ProgramacionDinamica;

public class Punto1 {

    public int recursivo(int n){
        if(n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n > 1){
            return recursivo(n-1) + recursivo(n-2);
        }

        return n;
    }

    public int iterativo(int n){
        int valor = 0;

        if(n == 0){
            return 3;
        }else if (n == 1){
            return 2;
        }else if (n > 1){
            int a = 3;
            int b = 2;
            for (int i = 2; i <= n; i++) {
                valor = a + b;
                a = b;
                b = valor;
            }
            return valor;
        }
        return valor;
    }

    public int tabulacion(int n){

        if(n <= 1){
            return n == 0 ? 3 : 2;
        }
        int[] dp = new int [n+1]; // tamano
        dp[0] = 3;
        dp[1] = 2;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
       
    private int[] memo;

    public int memorizacion(int n) {
        memo = new int[n + 1];
        return fibonacciMemo(n);
    }

    private int fibonacciMemo(int n) {
        if (n <= 1) {
            return n == 0 ? 3 : 2; // Valores iniciales
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        return memo[n];
    }
    
}
