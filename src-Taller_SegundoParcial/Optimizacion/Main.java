package Optimizacion;

public class Main {
    public static void main(String[] args) {
        Codigo1 codigo1 = new Codigo1();
        long startTime, endTime;
        double elapsedTime;

        // Medir tiempo de ejecución del método no optimizado
        startTime = System.nanoTime();
        codigo1.prueba();
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e6; // Convertir nanosegundos a milisegundos
        System.out.println("Tiempo de ejecución del método no optimizado: " + elapsedTime + " milisegundos");


        // Medir tiempo de ejecución del método optimizado
        startTime = System.nanoTime();
        codigo1.Prueba_Optimizada();
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e6; // Convertir nanosegundos a milisegundos
        System.out.println("Tiempo de ejecución del método optimizado: " + elapsedTime + " milisegundos");
    }
}

