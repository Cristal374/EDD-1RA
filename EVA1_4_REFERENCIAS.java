
package eva_1_scope;

public class EVA1_4_REFERENCIAS {
   public static void main(String[] args) {
      
      //Referencia --> una direccion de memoria
      // Apuntadores --> direcciones de memoria en c++
       
       Prueba prueba = new Prueba(); //     Quitar la direccion con el null
       prueba = null; // Manera directa de quitar la variable que no queremos usar en Java
       System.out.println("prueba");
   }   
   } 
    // Como destruye java los objetos que ya no se van a usar?
    // GARBAGE COLLECTOR --> detecta los objetos que no estas usando y los destruye 
class Prueba{
    
}
