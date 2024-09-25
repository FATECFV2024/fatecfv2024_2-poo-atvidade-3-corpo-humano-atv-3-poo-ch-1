package main.java;
import java.util.Scanner;

public class App {
    public static void funcao_teste() {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe sua altura em metros: ");
        float altura = ler.nextFloat();

        System.out.printf("Informe seu peso em kg: ");
        float peso = ler.nextFloat();

        System.out.printf("Informe seu volume em metros cúbicos: ");
        float volume = ler.nextFloat();

        System.out.printf("Informe sua densidade em kg/m³: ");
        float densidade = ler.nextFloat();

        // Cria o objeto CorpoHumano com os dados fornecidos
        CorpoHumano corpo = new CorpoHumano(altura, peso, volume, densidade);
        corpo.exibirInformacoes();

        ler.close();
    }

    public static void main(String[] args) {
        funcao_teste();
    }
}
