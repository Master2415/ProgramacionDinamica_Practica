package Punto2;

public class ListaCircular<T> {
	
	private Nodo<T> cabeza;
	private Nodo<T> cola;
	
	
	public ListaCircular() {
		super();
		this.cabeza = null;
		this.cola = null;
	}
	
	public void agregar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.setSiguiente(cabeza);
        } else {
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
            cola.setSiguiente(cabeza);
        }
    }
	 
	public void imprimir() {
        if (cabeza != null) {
            Nodo<T> actual = cabeza;
            do {
                System.out.println(actual.getValor());
                actual = actual.getSiguiente();
            } while (actual != cabeza);
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
    
    public void insertarEnPosicion(T valor, int posicion) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);

        if (posicion < 0) {
            throw new IndexOutOfBoundsException("La posición no puede ser negativa");
        }

        if (cabeza == null) {
            if (posicion == 0) {
                cabeza = nuevoNodo;
                cola = nuevoNodo;
                cola.setSiguiente(cabeza);
            } else {
                throw new IndexOutOfBoundsException("La posición está fuera de los límites");
            }
            return;
        }

        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            cola.setSiguiente(cabeza);
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (contador < posicion - 1 && actual.getSiguiente() != cabeza) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (contador == posicion - 1) {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);

            if (nuevoNodo.getSiguiente() == cabeza) {
                cola = nuevoNodo;
            }
        } else {
            throw new IndexOutOfBoundsException("La posición está fuera de los límites");
        }
    }
	
	
	
	
}
