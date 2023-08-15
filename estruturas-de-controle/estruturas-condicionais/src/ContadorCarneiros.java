public class ContadorCarneiros {
    public static void main(String[] args) {
        final int TOTAL_CARNEIROS = 20;
        for(int i = 1; i <= TOTAL_CARNEIROS; i++){
            System.out.printf("Contador de carneiros: %d\n", i);
            if(i % 5 == 0) {
                System.out.println(".........................");
            }
        }
    }
}
