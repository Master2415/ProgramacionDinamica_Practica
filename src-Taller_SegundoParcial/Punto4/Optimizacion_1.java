package Punto4;

public class Optimizacion_1 {
    public static void main(String[] args) {

        Optimizacion_1 programa = new Optimizacion_1();

        long startTime = System.nanoTime();
        programa.Desenvolvimiento();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de ejecucion 1: " + elapsedTime + " nanosegundos");
        
        long startTime1 = System.nanoTime();
        programa.DesenvolvimientoOptimizado();
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Tiempo de ejecucion 2: " + elapsedTime1 + " nanosegundos");

        //programa.mostrarArreglo();
    }
    
    public void Desenvolvimiento(){
		int arreglo[] = new int[4000];
		int operacion[] = { 1, 2, 3, 4 };
		int longi=arreglo.length , i, j=0;
	
		for (i=0;i<longi;i++){
			arreglo[i]=(int) (operacion[j++]*(Math.pow(i,2)+Math.pow(i,2))*i);
			
			if (j==4) j=0;
		}
	}

    public void DesenvolvimientoOptimizado() {
        int[] arreglo = new int[4000];
        int[] operacion = {1, 2, 3, 4};
        int longi = arreglo.length;
        int j = 0;

        for (int i = 0; i < longi; i += 4) {
            arreglo[i] = operacion[j++] * (i * i + i * i) * i;
            arreglo[i + 1] = operacion[j++] * ((i + 1) * (i + 1) + (i + 1) * (i + 1)) * (i + 1);
            arreglo[i + 2] = operacion[j++] * ((i + 2) * (i + 2) + (i + 2) * (i + 2)) * (i + 2);
            arreglo[i + 3] = operacion[j++] * ((i + 3) * (i + 3) + (i + 3) * (i + 3)) * (i + 3);
            if (j == 4) j = 0;
        }
    }

    public void mostrarArreglo() {
        int[] arreglo = new int[4000];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
    }
}
