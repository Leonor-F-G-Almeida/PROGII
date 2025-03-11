interface Cores {
    String AZUL = "Azul";
    String VERDE = "Verde";
    String CINZENTO = "Cinzento";
    String VERMELHO = "Vermelho";

    String getCor(); //necessário fazer uma função "normal" GetColor()
    /**
     * Define uma nova cor para o objeto.
     *
     * @param cor A nova cor (deve estar na lista de cores permitidas).
     * @throws IllegalArgumentException Se a cor não estiver na lista de cores permitidas.
     */
    void setCor(String cor); //necessário fazer uma função "normal SetColor()
}
