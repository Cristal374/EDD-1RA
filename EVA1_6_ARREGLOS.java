
package eva_1_scope;


public class EVA1_6_ARREGLOS {
    
        public static void main(String[] args) {
           int [] arreglo1 = new int[100];// Cuanta memoria ocupa? ocupa 40 bytes 
           // acceso por indices 
           arreglo1 [1] = 100;
           // en java, el primer elemento es el que en la posicion 0, el ultimo es n-1
           // donde n es del tamaño del arreglo 
           
            for ( int i = 0; i < 10; i++){ // Llenarlo de valores aleatorios de 0 a 99
            arreglo1 [i] = (int) (Math.random() * 100);
            }
             for ( int i = 0; i < 10; i++){ // Llenarlo de valores de 0 al 99 
                 System.out.println("["+ arreglo1 [i] +"]");
             }
        
        }
}
