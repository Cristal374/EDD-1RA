
package eva_1_scope;


public class EVA1_1_SCOPE {
    public static void main (String  [] args){
        int x = 100;//existe en tofo el bloque main
         for ( int i =0; i < 10; i++){// existe solo dentro del bloque 
             System.out.println("Valor de i = " + i);
                     
         }
          System.out.println("Valor final de i = " + i);//no existe aqui
          System.out.println("Valor final de la x = " + x);// si existe aqui 
    }
          public static void OtraFuncion(){
               System.out.println("Valor de x = " + x);//no existe aqui
          }
}
