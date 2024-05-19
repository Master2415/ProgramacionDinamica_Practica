package ProgramacionDinamica;

public class Punto10 {

    public int recursivo(int n, int k){

        if(k == n || k == 0){
            return 2;
        }else if(k > 0 && k < n){
            return recursivo(n-1, k) * 3 + recursivo(n-1, k-1) + recursivo(n, k-1);
        }
        return 0;
    }

    public int tabulacion(int n, int k){

        int[][] aa = new int[n+1][n+1];

        for(int i=0; i<=n; i++){
            aa[i][0] = 2;
            aa[i][i] = 2;
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                aa[i][j] = aa[i-1][j] * 3 + aa[i-1][j-1] + aa[i][j-1];
            }
        }

        return aa[n][k];
    }
    


    public int memorizacion(int n, int k){

        int[][] memo = new int[n+1][k+1];

        if(k == n || k == 0){
            return 2;
        }else if(k > 0 && k < n){
            return memo[n][k] = recursivo(n-1, k) * 3 + recursivo(n-1, k-1) + recursivo(n, k-1);
        }
        return 0;
    }

}