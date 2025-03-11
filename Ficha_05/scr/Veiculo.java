public class Veiculo implements Cores, Imposto {
    private final String matricula;
    private final int cilindrada;
    private String cor;

    /**
     * Constructs a new Veiculo instance.
     *
     * @param matricula the license plate of the vehicle (must not be null or empty)
     * @param cilindrada the engine displacement of the vehicle (must be positive)
     * @param cor the color of the vehicle (must not be null or empty)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Veiculo(String matricula, int cilindrada, String cor) {
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("A matrícula não pode ser vazia.");
        }
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("A cilindrada deve ser um valor positivo.");
        }
        if (cor == null || cor.isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser vazia.");
        }

        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    /**
     * Gets the license plate of the vehicle.
     *
     * @return the license plate of the vehicle
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Gets the engine displacement of the vehicle.
     *
     * @return the engine displacement of the vehicle
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Gets the color of the vehicle.
     *
     * @return the color of the vehicle
     */
    @Override
    public String getCor() {
        return cor;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param cor the new color of the vehicle
     * @throws IllegalArgumentException if the color is null or empty
     */
    @Override
    public void setCor(String cor) {
        if (cor != AZUL && cor != VERDE && cor !=CINZENTO && cor !=VERMELHO ||  cor.isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser vazia.");
        }
        this.cor = cor;
    }

    /**
     * Returns a string representation of the vehicle.
     *
     * @return a string representation of the vehicle
     */
    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    /**
     * Calculates the tax for the vehicle.
     *
     * @return the calculated tax
     */
    @Override
    public float calculaImposto() {
        if (cilindrada < 1000) {
            return 10.0f;
        } else if (cilindrada < 1500) {
            return 20.0f;
        } else if (cilindrada < 2000) {
            return 35.0f;
        } else {
            return 50.0f;
        }
    }
}
