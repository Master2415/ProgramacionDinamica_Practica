package Punto9;

public class Main {
    public static void main(String[] args) {
        // Crear una lista circular
        ListaCircular lista = new ListaCircular();

        // Insertar algunos elementos en la lista
        lista.insertarElemento("A");
        lista.insertarElemento("B");
        lista.insertarElemento("C");
        lista.insertarElemento("D");
        lista.insertarElemento("E");

        // Mostrar la lista antes de realizar operaciones
        System.out.println("Lista antes de eliminar el segundo nodo:");
        lista.mostrarLista();

        // Eliminar el segundo nodo
        lista.eliminarNodo(1);

        // Mostrar la lista después de eliminar el segundo nodo
        System.out.println("\nLista después de eliminar el segundo nodo:");
        lista.mostrarLista();

        // Insertar un nodo en la antepenúltima posición
        lista.insertarAntepenultimo("F");

        // Mostrar la lista después de insertar un nodo en la antepenúltima posición
        System.out.println("\nLista después de insertar un nodo en la antepenúltima posición:");
        lista.mostrarLista();
    }
}
