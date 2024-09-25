package main.java;
import java.util.Scanner;

public class App {
    public static void funcao_teste() {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe sua altura em metros: ");
        float altura = ler.nextFloat();

        System.out.printf("Informe sua massa em kg: ");
        float massa = ler.nextFloat();

        CorpoHumano corpo = new CorpoHumano(altura, massa);
        corpo.exibirInformacoes();

        ler.close();
    }

    public static void main(String[] args) {
        funcao_teste();
    }
}