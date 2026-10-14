package eva1_1_scope;

import java.util.Scanner;

public class EVA2_2_LISTA_SIMPLE {

    private Nodo inicio;

    // inicio = null;// si sale null la lista no tiene nodos

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(150);//Posicion [0]
        lista.agregar(250);//[1
        lista.agregar(350);//[2]
        lista.agregar(480);//[3]
        lista.agregar(550);//[4]
        lista.agregar(350);
        lista.insertarEn(2, 456); //Posicion donde la agregaremos es [2]
        lista.imprimir();

        System.out.println("<------------------------------->  ");
        lista.imprimirInverso();

        //Saber si esta,  vacia la lista 
        if (lista.estaVacia()) {
            System.out.println("La lista tiene nodos ");
        } else {
            System.out.println("La lista no esta vacia");

        }
        System.out.println("La longitud de la lista: " + lista.longitud());
        System.out.println("El numero encontrado posicion: ");
        System.out.print(lista.encontrarEn(2)); //Posicion que elegimos a encontrar
        lista.vaciarLista();
        lista.imprimir();
        //Buscamos un dato en nuestra lista
        // System.out.println("Posicion encontrada: " + lista.buscarNodo(350));

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea a buscar: ");
        int buscar = sc.nextInt();//Colocar nextInt, double o line, menos en String
        if (lista.buscarNodo(buscar)) {
            System.out.println("El dato se encuentra");
        } else {
            System.out.println("Valor no encontrado");
            //lista.agregar(820);
            lista.agregar(260);
            lista.agregar(80);
            lista.agregar(650);
            lista.agregar(740);
            lista.agregar(150);
            lista.agregar(250);
            lista.agregar(350);
            lista.agregar(480);
            lista.agregar(550);
            lista.agregar(260);
            lista.imprimir();
        }

        System.out.println("Ingrese el numero que desea eliminar:  " + lista.eliminarPosicion());
        lista.eliminarPosicion();
        //int posicion= sc.nextInt();
        System.out.println("Valores restantes:  ");
        lista.imprimir();
        System.out.println("<------------------->");
        // Agregamos variable
        int eliminado = lista.eliminarPosicion();
        System.out.println("Elemento a eliminar: " + eliminado);
        lista.imprimir();
         System.out.println("<------------------->");
        
        System.out.println ("Valor eliminado" );
        lista.eliminarValor(350);
        lista.imprimir();
        
        System.out.println(" la lista esta vacia");
        lista.vaciarLista();
        lista.imprimir();
        // Un elemento en posicion especifica
        
    }

//int  [] arreglo = new int [100000];
    //long ini, fin, tiempo;
        // La big oh de la operacion es de (N2)
    //ini = System.nanoTime();
    //for (int i = 0; i < 10000000; i++) {
    //  lista.agregar((int) (Math.random() * 100));
        //fin = System.nanoTime();
    //tiempo = fin - ini;
    //System.out.println("Tiempo de la lista :  " + tiempo + "ns");
}
