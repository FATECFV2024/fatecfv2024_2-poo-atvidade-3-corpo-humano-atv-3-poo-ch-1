package main.java;
import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void funcao_teste() {

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        double massa, volume, densidade, altura;

        System.out.println("Entrada de dados do corpo humano:");

        System.out.println("Informe a massa (kg): ");
        massa = ler.nextDouble();

        System.out.println("Informe o volume (m³): ");
        volume = ler.nextDouble();

        System.out.println("Informe a densidade (kg/m³): ");
        densidade = ler.nextDouble();

        System.out.println("Informe a altura (m): ");
        altura = ler.nextDouble();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);

        System.out.println("\nDados do corpo humano:");
        c1.imprimirDados();
    }

    public static void main(String[] args) throws Exception {
        funcao_teste();
    }
}
