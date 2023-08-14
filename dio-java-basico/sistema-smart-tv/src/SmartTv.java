public class SmartTv {
    boolean estaLigada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        estaLigada = true;
    }
    public void desligar() {
        estaLigada = false;
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume.");
        volume++;
    }
    public void diminuirVolume() {
        System.out.println("Diminuindo volume.");
        volume--;
    }

    public void subirDeCanal() {
        canal++;
    }
    public void descerDeCanal() {
        canal--;
    }
    public void definirCanal(int novoCanal) {
        canal = novoCanal;
    }
}
