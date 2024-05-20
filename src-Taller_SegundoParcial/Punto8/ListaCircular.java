package Punto8;
    
class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(int valor) {
        if (cabeza == null) {
            cabeza = new Nodo(valor);
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = new Nodo(valor);
        }
    }

    // Método recursivo para eliminar un nodo en una posición determinada
    public Nodo eliminarEnPosicion(Nodo nodo, int posicion) {
        // Caso base: si la lista está vacía o posición es inválida
        if (nodo == null || posicion < 0) {
            return nodo;
        }

        // Si la posición es 0, eliminamos el nodo actual (cabeza)
        if (posicion == 0) {
            return nodo.siguiente; // El nuevo cabeza de la lista
        }

        // Llamada recursiva para eliminar el nodo en la posición (posicion-1) en la sublista
        nodo.siguiente = eliminarEnPosicion(nodo.siguiente, posicion - 1);
        return nodo;
    }

    // Método para eliminar un nodo en una posición determinada utilizando el método recursivo
    public void eliminar(int posicion) {
        cabeza = eliminarEnPosicion(cabeza, posicion);
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
