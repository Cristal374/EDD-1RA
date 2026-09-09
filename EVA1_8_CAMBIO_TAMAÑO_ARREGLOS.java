
import arreglos.datos;


public class EVA1_8_CAMBIO_TAMAÑO_ARREGLOS {
    public static void main (String [] args){
        
        int [] datos= new int[10];
        System.out.println(datos);
        
        for (int i=0; i < datos.length; i++){
        datos [i] = (int) (Math.random() * 100);
        }
        System.out.println("");
        //Puede que si haya una forma de cambiar el tamaño
        
        datos= new int[5];
        System.out.println(datos);
        
        // imprimir datos 
         for (int i=0; i < datos.length; i++){
         System.out.println("[" + datos[i] +"]");
             
         
              }
    }
    }
         // Necesita un respapaldo
         //Necesitamos camabiar de 10 a 5 elementos (los´primeros 5) sin perder la informacion pasada
         
        class cambio{
        int [] aiArray= new int[10];
        int [] aiCambio= new int[5];
        cambio= new Cambio [5];

        
        for(int i=0; i < cambio.length; i++){
        int[] Cambio = null;
        Cambio [i] = (int) (Math.random() * 100)
        
                
                }       
              
          }
       }
    }
