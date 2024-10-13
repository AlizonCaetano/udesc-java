import java.util.Scanner;

public class converteSegundosParaHorasMinutosSegundos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe em segundos, um valor para ser convertido em horas: ");
        int segundosParaConverter = s.nextInt();

        System.out.print("O valor convertido é: " + conversor(segundosParaConverter));
    }

    public static String conversor(int segundos) {
        String valorConvertido = "";

        int horasInteiras = segundos / 3600;
        int horasResto = segundos % 3600;

        int minutosInteiros= horasResto / 60;
        int minutosResto = horasResto % 60;

        int segundosInteiros = minutosResto;

        valorConvertido = horasInteiras + "h " + minutosInteiros + "m " + segundosInteiros + "s";

        return valorConvertido;
    }
}
