
package eva1_1_scope;

import java.util.Scanner;

public class EVA1_13_CALIFAS {

     public static void main (String[] args){
         //Variable para guardar nuestros datos
         int grupos;
         Scanner captu = new Scanner(System.in);
          System.out.println("¿Cuantos grupos tenemos que capturar?");
          grupos = captu.nextInt(); //Guardamos los grupos
          
         ////Creamos nuestra matriz
         int[][] califas = new int[grupos][];
        
         //// Primer bucle para definnir el tamaño de  la matriz 
          for (int i = 0; i < grupos; i++) {
              System.out.println("¿Cuantos alumnos hay en cada salon? " + (i+1));
              int alumnos = captu.nextInt();
              califas[i] = new int[alumnos];
          }

         ///Creamos nuestro segundo bucle
          for (int i = 0; i < califas.length; i++){
        ///Recorre primero todas las filas      
              for (int j = 0; j < califas[i].length; j++){
                  //Recorre todas las columnas 
                  System.out.println("["+ califas[i][j]+"]");
              }
          }
     }
}
