public class Operadores {
    public static void main(String[] args) {
        //Operadores - simbolos utilizados para operações

        // Atribuição (=)
        // String myName = "Tiago Macedo Cesar";
        int myAge = 30;
        //double myWeight = 110.4;
        char myGender = 'm';
        String myDnDClass = "paladin";
        boolean isOrganDonor = true;

        //System.out.printf("2 + 2 = %.2f\n", add(2, 2));

        //Operadores unários (- +)
        //System.out.println(-myAge);

        //Operadores incremento/decremento(++ --)
        // System.out.println(myAge++);//imprime e incrementa
        // System.out.println(myAge--);//imprime e decrementa
        // System.out.println(--myAge);//decrementa e imprime
        // System.out.println(++myAge);//incrementa e imprime

        //Operador de negação (!)
        // System.out.println(isOrganDonor);
        // System.out.println(!isOrganDonor); //em memória. não altera o valor.

        //Operador ternário (?:)
        // if(isOrganDonor) System.out.println("Horray");
        // else System.out.println("Oh..." );
        //System.out.printf("%s", isOrganDonor?"Horray":"Oh...");

        // System.out.printf("Is older then the internet? %b", firstIsGreater(myAge, 40));

        //Operadores lógicos (&& ||)
        if (myAge >= 18 && isOrganDonor) {
            System.out.println("Can donate organs.");
        }
        if (myDnDClass == "warlock" || myGender == 'm'){
            System.out.println("Can make pact with the Queen of Fays.");
        }

    }

    //Operadores Relacionais
    public static boolean isEqual (double a, double b) {
        return a == b;
    }
    public static boolean firstIsGreater (double a, double b) {
        return a > b;
    }
    public static boolean firstIsGreateOrEqual (double a, double b) {
        return a >= b;
    }
    public static boolean seccondIsGreater (double a, double b) {
        return a < b;
    }
    public static boolean seccondIsGreaterOrEqual (double a, double b) {
        return a <= b;
    }
    public static boolean isDifferent (double a, double b) {
        return a != b;
    }

    //Operadores Aritméticos
    public static double add (double a, double b){
        return a + b;
    }
    public static double subtract (double a, double b){
        return a - b;
    }
    public static double multiply (double a, double b){
        return a * b;
    }
    public static double divide (double a, double b){
        return a / b;
    }
    public static double findRemainder (double a, double b){
        return a % b;
    }

    //Concatenação
    public static String concatenate (String a, String b) {
        return a + b;
    }
}
