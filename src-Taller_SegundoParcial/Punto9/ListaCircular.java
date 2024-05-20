package Punto9;

public class ListaCircular {
    private Nodo inicio;
    private Nodo ultimo;
    private int cantidad;

    // Constructor de la lista
    public ListaCircular() {
        inicio = null;
        ultimo = null;
        cantidad = 0;
    }

     // Método para eliminar un nodo en una posición dada
     public void eliminarNodo(int posicion) {
        if (inicio == null || posicion <= 0 || posicion >= cantidad) {
            return; // Lista vacía o posición inválida
        }

        Nodo actual = inicio;
        Nodo anterior = null;
        int contador = 0;

        while (contador < posicion) {
            anterior = actual;
            actual = actual.getSiguiente();
            contador++;
        }

        // Eliminar el nodo actual
        anterior.setSiguiente(actual.getSiguiente());

        // Si el nodo a eliminar es el último, actualizar el último nodo
        if (actual == ultimo) {
            ultimo = anterior;
        }

        cantidad--;
    }

    // Método para insertar un nodo en la antepenúltima posición
    public void insertarAntepenultimo(Object valor) {
        Nodo nuevoNodo = new Nodo(valor, null);

        if (cantidad < 2) {
            return; // La lista tiene menos de dos nodos, no se puede insertar en la antepenúltima posición
        }

        Nodo actual = inicio;
        int contador = 0;

        // Avanzar hasta el antepenúltimo nodo
        while (contador < cantidad - 2) {
            actual = actual.getSiguiente();
            contador++;
        }

        // Insertar el nuevo nodo entre actual y su siguiente
        nuevoNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoNodo);

        // Si el nuevo nodo se inserta al final, actualizar el puntero de último
        if (actual == ultimo) {
            ultimo = nuevoNodo;
        }

        cantidad++;
    }

    // Método para insertar un elemento al final de la lista
    public void insertarElemento(Object valor) {
        Nodo nuevoNodo = new Nodo(valor, null);

        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(inicio);
            ultimo = nuevoNodo;
        }

        cantidad++;
    }

    // Método para mostrar los elementos de la lista
    public void mostrarLista() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = inicio;
        do {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        } while (actual != inicio);

        System.out.println("(Inicio)");
    }

    // Otros métodos de la clase...
}
