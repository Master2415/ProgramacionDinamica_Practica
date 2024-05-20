package Optimizacion;

public class Codigo1 {

        int[] arreglo = new int[6000000];
        int[] arreglo1 = new int[6000000];
        int[] operacion = {1, 2, 3, 4, 5, 6};

        public void prueba(){
            int k = 0;

            for (int i=0; i<arreglo.length; i++){
                arreglo[i]= operacion[k++] + (int) Math.pow(i,3);

                if (k == 6){
                    k = 0;
                }
            }

            for (int i=0; i<arreglo1.length; i++){
                arreglo1[i] = (int) (Math.pow(i,3) + Math.pow(i,3));
            }

            for (int i=0; i<arreglo.length; i++){
                arreglo[i]= arreglo1[i] - arreglo[i];
            }
        }
    
        public void Prueba_Optimizada() {
            int k = 0;
            
            for (int i = 0; i < arreglo.length; i += 6) {
                arreglo[i] = operacion[k++] + (i * i * i);
                arreglo[i + 1] = operacion[k++] + ((i + 1) * (i + 1) * (i + 1));
                arreglo[i + 2] = operacion[k++] + ((i + 2) * (i + 2) * (i + 2));
                arreglo[i + 3] = operacion[k++] + ((i + 3) * (i + 3) * (i + 3));
                arreglo[i + 4] = operacion[k++] + ((i + 4) * (i + 4) * (i + 4));
                arreglo[i + 5] = operacion[k++] + ((i + 5) * (i + 5) * (i + 5));
                if (k == 6) {
                    k = 0;
                }
            }
    
            for (int i = 0; i < arreglo1.length; i++) {
                arreglo1[i] = (i * i * i) + (i * i * i);
            }
    
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = arreglo1[i] - arreglo[i];
            }
        }

       
}
