public class CorpoHumano {
    // Atributos privados
    private float massa;
    private float volume;
    private float densidade;

    // Construtor
    public CorpoHumano(float massa, float volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = calcularDensidade();
    }

    // Métodos Getters
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    // Métodos Setters
    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = calcularDensidade();
    }

    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = calcularDensidade();
    }

    // Método para calcular a densidade
    private float calcularDensidade() {
        return massa / volume;
    }
    
}

