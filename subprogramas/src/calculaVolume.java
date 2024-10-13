import java.util.Scanner;

public class calculaVolume {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informa o valor de um raio para calcular o volume: ");

        double raioResposta = s.nextInt();

        double guardaResultadoVolume = calculaVolume(raioResposta);

        System.out.println("O volume é: " + guardaResultadoVolume);
    }

    public static double calculaVolume(double raio) {
        double volume;

        double pi = Math.PI;
        double raioAoCubo = Math.pow(raio, 3);
        volume = (4/3)*pi*raioAoCubo;

        return volume;
    }
}