package Punto2;

public class Main {

	public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();
        
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.insertarEnPosicion(10, 2);
        
        System.out.println("Elementos en la lista circular:");
        lista.imprimir();
    }
}
