public class MainTributaveis {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("22-33-CC", 1000, "Verde");

        System.out.println(meuVeiculo);

        System.out.println("Imposto a pagar: " + meuVeiculo.calculaImposto() + " euros");
    }
}
