package eva1_1_scope;

public class EVA1_14_PRIMOS {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 22) + 2;
        boolean numPrimo = true;

        if (num <= 1) {
            numPrimo = false;
        }
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    numPrimo = false;
                    break;
                }
            }
        }
        System.out.println(" " + num);
        
        if (numPrimo) {
            System.out.println("Numero primo");
        }
        else {
            System.out.println("No es un numero primo");
        }
    }
}
