public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada? " + smartTv.estaLigada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("\nLigada? " + smartTv.estaLigada);
    }
}
