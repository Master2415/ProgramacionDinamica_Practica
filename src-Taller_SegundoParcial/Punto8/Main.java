package Punto8;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.println("Lista original:");
        lista.imprimirLista();

        lista.eliminar(2); // Elimina el nodo en la posición 2 (valor 3)

        System.out.println("Lista después de eliminar el nodo en la posición 2:");
        lista.imprimirLista();
    }
}
