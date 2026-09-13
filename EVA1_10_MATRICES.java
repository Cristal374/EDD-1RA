
package eva1_1_scope;


public class EVA1_10_MATRICES {

 
    public static void main(String[] args) {
        int [][] matriz =  new int [5][3]; 
        for(int i = 0 ; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){ // Dimension de tres columnas 
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        //imprimimos los datos
        for (int i= 0; i<matriz.length; i++){
              for(int j = 0; j<matriz[i].length; j++){
                System.out.println("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}

