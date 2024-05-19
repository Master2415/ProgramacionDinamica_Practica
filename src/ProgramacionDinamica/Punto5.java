package ProgramacionDinamica;

public class Punto5 {

    public int recursivo(int n, int k){

        if(k == 0){
            return 1;
        }else if(n == k){
            return (int) Math.pow(n,n);
        }else if(0 < k && k < n){
            return recursivo(n-1, k)*3 + recursivo(n-1, k-1)*2;
        }else{
            return 0;
        }
        
    }

    public int tabulacion(int n, int k){
        int[][]arr = new int[n+1][n+1];

        // Caso base: k == 0 o k == n
        for(int i = 0; i <= n; i++){
           arr[i][0] = 1; // (n, 0)
           arr[i][i] = (int) Math.pow(i, i); // (n, k)
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j]*3 + arr[i-1][j-1]*2;
            }
        }
        
        return arr[n][k];
    }

    public int memo(int n, int k){
        int[][] pp = new int[n+1][k+1];

        if(k == 0){
            return 1;
        }else if(n == k){
            return (int) Math.pow(n,n);
        }else if(0 < k && k < n){
            return pp[n][k] = memo(n-1, k)*3 + memo(n-1, k-1)*2;
        }

        return pp[n][k];
    }
    
}
