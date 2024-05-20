package Punto9;

public class Nodo {
    private Object valor;
    private Nodo siguiente;

    // Constructor de Nodo
    public Nodo() {
        this.siguiente = null;
    }

    // Constructor de Nodo
    public Nodo(Object valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    // Métodos get y set
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}