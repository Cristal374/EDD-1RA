
package eva_1_scope;


public class EVA1_5_PASO_VALOR_REFERENCIA {
    
        public static void main(String[] args) {
          int x =5;
          System.out.println("Valor de x= " + x);
          incrementar(x);
          System.out.println("Valor de x modificado = " + x); // Aqui aun no se obtienen cambios sigue siendo 5
          
          MiValor mv= new MiValor();
          System.out.println("MiValor.y = " + mv.y);
          incrementarObj(mv);
          System.out.println("MiValor.y = " + mv.y); // Aqui si se genera el cambio de 5 a 6
        }
        
    public static void incrementar (int valor){ // 
        valor = valor + 1;   // Recibimos una copia de lo que esta almacenada, no se modifica el valor 
        
    }
    // Recibo una copia de la direccion del objeto 
     public static void incrementarObj(MiValor valor){
         valor.y= valor.y + 1;
         
     }
}
     class MiValor{
         int y= 5;
     }

