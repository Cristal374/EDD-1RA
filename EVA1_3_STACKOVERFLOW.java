
package eva_1_scope;

public class EVA1_3_STACKOVERFLOW {
    
        public static void main(String[] args) {
        System.out.println("INICIA MAIN ");
        A();
        System.out.println("TERMINA MAIN ");
    }
    public static void A() {
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B() {
        System.out.println("INICIA B()");
        A();
        System.out.println("TERMINA B()");
    }
}


