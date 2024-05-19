package Punto2;

public class Nodo<T> {

    private T valor;
    private Nodo<T> siguiente;
    
	public Nodo(T valor) {
		super();
		this.valor = valor;
		this.siguiente = this;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	

    

}
