// main/java/CorpoHumano.java
package main.java;

public class CorpoHumano {
    private double massa;      // em Kg
    private double volume;     // em M³
    private double densidade;  // em Kg/m³
    private double altura;     // em Metros

    public CorpoHumano(double massa, double volume, double densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public double getMassa() {
        return massa;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularIMC() {
        return massa / (altura * altura);
    }

    public void imprimirDados() {
        System.out.println("Massa: " + massa + " kg");
        System.out.println("Volume: " + volume + " m³");
        System.out.println("Densidade: " + densidade + " kg/m³");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularIMC());
    }
}
