package Punto3;

public class Main {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda
        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>();

        // Insertar algunos valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Imprimir el árbol antes de eliminar un nodo
        System.out.println("Arbol antes de eliminar:");
        arbol.imprimir();

        // Eliminar un nodo del árbol
        arbol.eliminar(40);

        // Imprimir el árbol después de eliminar el nodo
        System.out.println("Arbol despues de eliminar:");
        arbol.imprimir();
    }
}
