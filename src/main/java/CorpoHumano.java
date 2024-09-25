package main.java;

public class CorpoHumano {
    // Atributos
    private float altura; // em metros
    private float peso;   // em kg
    private float volume; // em metros cúbicos (calculado)
    private float densidade;  // em kg/m³ (calculada)

    // Construtor
    public CorpoHumano(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
        this.volume = calcularVolume(); // Volume calculado automaticamente
        this.densidade = calcularDensidade(); // Densidade calculada automaticamente
    }

    // Método para calcular o volume aproximado (baseado na fórmula de um cilindro simples)
    public float calcularVolume() {
        float raio = altura / 4; // Supondo que o "diâmetro" do corpo seja metade da altura
        return (float) (Math.PI * raio * raio * altura); // π * r² * h
    }

    // Método para calcular a densidade
    public float calcularDensidade() {
        return peso / volume;
    }

    // Método para calcular o IMC
    public float calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para classificar o IMC
    public String classificarIMC() {
        float imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (Obesidade mórbida)";
        }
    }

    // Método para exibir todas as informações
    public void exibirInformacoes() {
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("Volume (aproximado): %.2f m³\n", volume);
        System.out.printf("Densidade: %.2f kg/m³\n", densidade);
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.printf("Classificação do IMC: %s\n", classificarIMC());
    }

    // Getters e Setters (caso queira alterar valores)
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        this.volume = calcularVolume(); // Recalcula volume ao alterar altura
        this.densidade = calcularDensidade(); // Recalcula densidade
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.densidade = calcularDensidade(); // Recalcula densidade ao alterar peso
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }
}
