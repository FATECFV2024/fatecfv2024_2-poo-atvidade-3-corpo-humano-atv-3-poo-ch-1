package main.java;

public class CorpoHumano {
    // Atributos
    private float altura; // em metros
    private float peso;   // em kg

    // Construtor
    public CorpoHumano(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
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

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.printf("Classificação: %s\n", classificarIMC());
    }

    // Getters e Setters (opcionais)
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
