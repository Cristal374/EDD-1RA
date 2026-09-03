
package eva_1_scope;

public class EVA1_7_RAPIDEZ_ARREGLOS {
    public static void main(String[] args) {
        int [] arreglo1 = new int[1000000];// El manejo de arreglos es muy rapido 
            for ( int i = 0; i < arreglo1.length; i++){
            arreglo1 [i] = (int) (Math.random() * 1000000); //Necesitamos 4GB
        
       } 
    }
}
