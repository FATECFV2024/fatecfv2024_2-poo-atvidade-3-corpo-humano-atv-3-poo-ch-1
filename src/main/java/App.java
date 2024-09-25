package main.java;
import java.util.Scanner;

public class App {
    public static void funcao_teste() {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe sua altura em metros: ");
        float altura = ler.nextFloat();

        System.out.printf("Informe seu peso em kg: ");
        float peso = ler.nextFloat();

        // Cria o objeto CorpoHumano com os dados fornecidos, o volume e a densidade serão calculados automaticamente
        CorpoHumano corpo = new CorpoHumano(altura, peso);
        corpo.exibirInformacoes();

        ler.close();
    }

    public static void main(String[] args) {
        funcao_teste();
    }
}
