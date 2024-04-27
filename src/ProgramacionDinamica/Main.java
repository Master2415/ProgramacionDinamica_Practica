package ProgramacionDinamica;

public class Main {

    public static void pascal(int n, int k){
        TrianguloPascal trianguloPascal = new TrianguloPascal();

        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + trianguloPascal.memorizacion(n, k));
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

    public static void punto4(int n, int k){
        Punto4 punto4 = new Punto4();
        int resultado = punto4.tabulacion(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
    }

    public static void main(String[] args) {
        int n = 5; 
        int k = 3;

        //punto1(n, k);
        //punto2(n, k);
        //punto3(n, k);
        //punto4(n, k);
        pascal(n, k);
    }
}