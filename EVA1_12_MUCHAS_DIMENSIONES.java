
package eva1_1_scope;

public class EVA1_12_MUCHAS_DIMENSIONES {

    public static void main(String[] args) {
        int[][][][] muchasDim = new int[3][3][3][3];
        for (int i = 0; i < muchasDim.length; i++) {
            for (int j = 0; j < muchasDim[i].length; j++) {
                for (int k = 0; k < muchasDim[i][j].length; k++) {
                    for (int l = 0; l < muchasDim[i][j][k].length; l++) {
                        muchasDim[i][j][k][l] = (int) (Math.random() * 100);
                    }
                }
            }
        }
        for (int i = 0; i < muchasDim.length; i++) {
            for (int j = 0; j < muchasDim[i].length; j++) {
                for (int k = 0; k < muchasDim[i][j].length; k++) {
                    for (int l = 0; l < muchasDim[i][j][k].length; l++) {
                        System.out.print("[" + muchasDim[i][j][k][l] + "]");
                    }
                }
            }
        }

    }
}
