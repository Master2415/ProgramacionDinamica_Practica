package Punto7;

public class Main {

    public static void main(String[] args) {
        punto7(12);
    }

    public static void punto7(int n){
        ProduccionConejos conejos = new ProduccionConejos();
 
         for (int i = 0; i <= n; i++) {
             System.out.println(" F(" + i + ") = " + conejos.iterativa(i));
         } 
     }
}
