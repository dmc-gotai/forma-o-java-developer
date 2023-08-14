public class Escopo {
    double saldo = 10.0;
    //saldo tem escopo global
    //ou seja, acessivel por toda classe

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
        //valor tem escopo de método
        //ou seja, só pode ser acessada
        //dentro do método
    }
    public void imprimirSaldo(){
        System.out.println(saldo);
    }
    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for (int x=1; x<=5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }
        //x e valorMontante tem escopo local
        //ou seja, acessivel apenas no laço for
        return valorMontante;
    }
}
