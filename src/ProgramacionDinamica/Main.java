package ProgramacionDinamica;

public class Main {

    public static void mostrar_cualquier_matriz(int n, int k){
        Punto9 punto9 = new Punto9();
        int[][] matriz = punto9.misterio(n, k);
        mostrarMatriz(matriz);
    }

    public static void pascal(int n, int k){
        TrianguloPascal trianguloPascal = new TrianguloPascal();

        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + trianguloPascal.recursivo(n, k));
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + trianguloPascal.iterativo(n, k));
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + trianguloPascal.memorizacion(n, k));
    }

    public static void punto1(int n, int k){
        Punto1 punto1 = new Punto1();
        
        for (int i = 0; i <= n; i++) {
            System.out.print(" (n=" + i + ")= "+ punto1.recursivo(i));
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
        int resultado = punto4.memorizacion(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
    }

    public static void punto5(int n, int k){
        Punto5 punto5 = new Punto5();
        int resultado = punto5.memo(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
       
    }

    public static void punto6(int n, int k){
        Punto6 punto6 = new Punto6();
        int resultado = punto6.memorizacion(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
       
    }

    public static void punto7(int n, int k){
        Punto7 punto7 = new Punto7();
        int resultado = punto7.memorizacion(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
       
    }

    public static void punto10(int n, int k){
        Punto10 punto10 = new Punto10();
        int resultado = punto10.memorizacion(n, k);
        System.out.println("El resultado de f(" + n + ", " + k + ") es: " + resultado);
       
    }


    public static void main(String[] args) {
        int n = 5;
        int k = 4;

        //punto1(n, k);
        //punto2(n, k);
        //punto3(n, k);
        //punto4(n, k);
        //punto5(n, k);
        //punto6(n, k);
        //punto7(n, k);
        punto10(n, k);
        //mostrar_cualquier_matriz(n, k);

        //pascal(n, k);
    }



    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}