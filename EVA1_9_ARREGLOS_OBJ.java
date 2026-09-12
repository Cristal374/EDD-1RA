
package eva1_1_scope;

public class EVA1_9_ARREGLOS_OBJ {
    
    public static void main (String [] args){
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println("arreglo = "+  arreglo);//Arreglo que guarda dos tipos de ejemplos
        System.out.println("arreglo [0]= "+  arreglo[0]);
        System.out.println("arreglo [1]= "+  arreglo[1]);
        
       Ejemplo[] datos = new Ejemplo[2];
       arreglo [0]= new Ejemplo();
       arreglo [1]= new Ejemplo();
       arreglo [2]= new Ejemplo();
        
        System.out.println("arreglo = "+  arreglo);
        System.out.println("arreglo [0]= "+  arreglo[0]);
        System.out.println("arreglo [1]= "+  arreglo[1]);
        Ejemplo[] copia= arreglo;
   
        System.out.println("arreglo= "+  arreglo);
        System.out.println("copia= "+  copia);
        
        // Seguimos teniendo el arreglo con dos copias, 
        
    
    class Ejemplo{
        int valor=5;
       }
    }
}
