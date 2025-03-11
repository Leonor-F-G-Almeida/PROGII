/**
 * Class representing a residence that implements Cores and Imposto interfaces.
 */
public class Moradia implements Cores, Imposto {
    private final String morada;
    private final float area;
    private String cor;

    /**
     * Constructs a new Moradia instance.
     *
     * @param morada the address of the residence (must not be null or empty)
     * @param area the area of the residence (must be positive)
     * @param cor the color of the residence (must be a valid color from Cores)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Moradia(String morada, float area, String cor) {
        if (morada == null || morada.trim().isEmpty()) {
            throw new IllegalArgumentException("A morada não pode ser vazia.");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("A área deve ser um valor positivo.");
        }
        setCor(cor); // Usa o método setCor para validar a cor

        this.morada = morada;
        this.area = area;
    }

    /**
     * Gets the address of the residence.
     *
     * @return the address of the residence
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Gets the area of the residence.
     *
     * @return the area of the residence
     */
    public float getArea() {
        return area;
    }

    /**
     * Gets the color of the residence.
     *
     * @return the color of the residence
     */
    @Override
    public String getCor() {
        return cor;
    }

    /**
     * Sets the color of the residence, ensuring it is valid.
     *
     * @param cor the new color of the residence (must be one of the predefined colors)
     * @throws IllegalArgumentException if the color is invalid
     */
    @Override
    public void setCor(String cor) {
        if (!cor.equals(AZUL) && !cor.equals(CINZENTO) && !cor.equals(VERMELHO) && !cor.equals(VERDE)) {
            throw new IllegalArgumentException("Cor inválida! As cores permitidas são: Azul, Cinzento, Vermelho, Verde.");
        }
        this.cor = cor;
    }

    /**
     * Returns a string representation of the residence.
     *
     * @return a string representation of the residence
     */
    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f m² tem cor %s",
                morada, area, cor);
    }

    /**
     * Calculates the tax for the residence.
     *
     * @return the calculated tax
     */
    @Override
    public float calculaImposto() {
        return area * 2.0f; // Imposto baseado na área da moradia
    }
}
