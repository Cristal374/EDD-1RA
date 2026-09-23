
package eva1_1_scope;

public class Nodo {
        //ATRIBUTOS 
    private int valor;
  private Nodo siguiente;
//CONSTRUCTORES 
// Sirve para inicializarse a null

    public Nodo() {
        siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
    }
    
  // Agregar GETTER AND SETTER 
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente() {
        this.siguiente = siguiente;
    }
 

 
  
}
