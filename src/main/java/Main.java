public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto CorpoHumano
        CorpoHumano c1 = new CorpoHumano(20.0f, 0.07f);

        // Exibindo as informações
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Densidade: " + c1.getDensidade());

    }
}
