public class MainTributaveis {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("11-22-BB", 1400, "Vermelho");

        System.out.println(meuVeiculo);

        System.out.println("Imposto a pagar: " + meuVeiculo.calculaImposto() + " euros");


    }
}
