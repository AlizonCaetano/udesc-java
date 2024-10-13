import java.util.Scanner;

public class converteIdadeMesesDiasEmDias {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int dias, meses, anos;

        System.out.println("Informe a quantidade de anos, para conversão: ");
        anos = s.nextInt();

        System.out.println("Informe a quantidade de meses, para conversão: ");
        meses = s.nextInt();

        System.out.println("Informe a quantidade de dias, para conversão: ");
        dias = s.nextInt();

        System.out.println("O valor convertido é: " + converteEmDias(anos, meses, dias) + " dias");

    }

    public static int converteEmDias(int anos, int meses, int dias) {
        int anosEmDias = anos * 365;
        int mesesEmDias = meses * 30;

        int totalDias = anosEmDias + mesesEmDias + dias;

        return totalDias;
    }
}
