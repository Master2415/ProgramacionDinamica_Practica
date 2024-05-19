package Punto3;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public void eliminar(T valor) {
        raiz = eliminarNodo(raiz, valor);
    }

    private Nodo<T> eliminarNodo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return null; // El nodo no se encuentra en el árbol, no se hace nada
        }

        // Comparamos el valor del nodo con el valor que queremos eliminar
        int comparacion = valor.compareTo(nodo.getValor());

        // Si el valor a eliminar es menor que el valor del nodo actual, buscar en el subárbol izquierdo
        if (comparacion < 0) {
            nodo.setIzquierdo(eliminarNodo(nodo.getIzquierdo(), valor));
        }
        // Si el valor a eliminar es mayor que el valor del nodo actual, buscar en el subárbol derecho
        else if (comparacion > 0) {
            nodo.setDerecho(eliminarNodo(nodo.getDerecho(), valor));
        }
        // Si encontramos el nodo con el valor a eliminar
        else {
            // Caso 1: El nodo a eliminar es una hoja (no tiene hijos)
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null;
            }
            // Caso 2: El nodo a eliminar tiene un solo hijo
            else if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }
            // Caso 3: El nodo a eliminar tiene dos hijos
            else {
                // Encontrar el sucesor inmediato del nodo a eliminar (el menor valor del subárbol derecho)
                Nodo<T> sucesor = encontrarMinimo(nodo.getDerecho());
                // Reemplazar el valor del nodo a eliminar por el valor del sucesor
                nodo.setValor(sucesor.getValor());
                // Eliminar el sucesor del subárbol derecho
                nodo.setDerecho(eliminarNodo(nodo.getDerecho(), sucesor.getValor()));
            }
        }
        return nodo;
    }

    private Nodo<T> encontrarMinimo(Nodo<T> nodo) {
        // Buscar el nodo con el valor mínimo en el subárbol izquierdo
        while (nodo.getIzquierdo() != null) {
            nodo = nodo.getIzquierdo();
        }
        return nodo;
    }
    
    public void insertar(T valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo<T> insertarNodo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }

        int comparacion = valor.compareTo(nodo.getValor());

        if (comparacion < 0) {
            nodo.setIzquierdo(insertarNodo(nodo.getIzquierdo(), valor));
        } else if (comparacion > 0) {
            nodo.setDerecho(insertarNodo(nodo.getDerecho(), valor));
        }

        return nodo;
    }

    public void imprimir() {
        imprimirNodos(raiz);
    }

    private void imprimirNodos(Nodo<T> nodo) {
        if (nodo != null) {
            imprimirNodos(nodo.getIzquierdo());
            System.out.print(nodo.getValor() + " ");
            imprimirNodos(nodo.getDerecho());
        }
    }
    


}
