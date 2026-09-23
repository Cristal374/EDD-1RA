package eva1_1_scope;

public class EVA2_2_LISTA_SIMPLE {

    private Nodo inicio;
    // inicio = null;// si sale null la lista no tiene nodos
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.agregar(600);
        lista.agregar(700);
        lista.imprimir();
    }

}
