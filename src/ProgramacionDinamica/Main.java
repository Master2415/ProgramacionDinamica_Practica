package ProgramacionDinamica;

public class Main {

    public static int TrianguloPascalRecursivo(int n, int k) {

        // Recursivo
        if (k == 0 || k == n){
            return 1;
        }else if(k>0 && n>k){
            return TrianguloPascalRecursivo(n-1, k-1) + TrianguloPascalRecursivo(n-1, k);
        }else{
            return 0;
        }

        
    }

    public static int TrianguloPascalIterativo(int n, int k) {

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

    public static void mostrarPasal(int n, int k){
        int Recursivo = TrianguloPascalRecursivo(n, k);
        int iterativamente = TrianguloPascalIterativo(n, k);
        System.out.println("El resultado de f(" + k + ", " + n + ") es: " + Recursivo);
        System.out.println("El resultado de f(" + k + ", " + n + ") es: " + iterativamente);
        // ------------------------------------------------------------------------------------ //
    }

    public static void punto1(int n, int k){
        Punto1 punto1 = new Punto1();
        
        for (int i = 0; i <= n; i++) {
            System.out.println(" F(" + i + ") = " + punto1.tabulacion(i));
        }
       
        
    }

    public static void punto2(int n, int k){
       Punto2 punto2 = new Punto2();

        for (int i = 0; i <= n; i++) {
            System.out.println(" F(" + i + ") = " + punto2.memorizacion(i));
        } 
    }

    public static void punto3(int n, int k){
        Punto3 punto3 = new Punto3();

        for (int i = 0; i <= n; i++) {
            System.out.println(" F(" + i + ") = " + punto3.memorizacion(i));
        } 
    }

    public static void main(String[] args) {
        int k = 3; // Puedes cambiar estos valores para probar diferentes casos
        int n = 10;

        //punto1(n, k);
        //punto2(n, k);
        punto3(n, k);

        //mostrarPasal(n, k);
    }
}