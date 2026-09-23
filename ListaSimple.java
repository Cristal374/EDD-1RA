package eva1_1_scope;

public class ListaSimple {

    private Nodo inicio;
    
    public ListaSimple() {
        inicio = null; // SI se acaba de crear, no tiene nodos aun
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        //Verificar si tiene nodos 
        if (inicio == null) { // no tiene nodos 

        } else { //Si tiene nodo

            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();

            }
        }
    }
            // Como los podemos conectar, conectando el nodo final con el new nodo
    //Cambiando las direcciones del nodo final al nuevo nodo 

    public void imprimir() {
          //Vaalores de la lista de codigo-practica 1
        //Eficiencia de imprimir los datos
        Nodo temp = inicio;
        while (temp != null) {
            
        }
        System.out.println();

    }
}
