import java.util.Scanner;
public class verificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um valor inteiro e positivo: ");
        int valorInteiro = s.nextInt();

        if(verificaNumeroPrimo(valorInteiro))
            System.out.println("É um número primo");
            else System.out.println("Não é um número primo");

    }

    public static boolean verificaNumeroPrimo(int supostoNumeroPrimo) {
       boolean resultadoVerificaNumeroPrimo = true;
       int numeroDeDivisoesPerfeitas = 0;

       for (int i = supostoNumeroPrimo; i > 0; i--) {
           int checaDivisaoPerfeita = supostoNumeroPrimo % i;

           if (numeroDeDivisoesPerfeitas > 1) {
               resultadoVerificaNumeroPrimo = false;
           }
           if (checaDivisaoPerfeita == 0) {
               numeroDeDivisoesPerfeitas = numeroDeDivisoesPerfeitas + 1;
           }
       }

       return resultadoVerificaNumeroPrimo;
    }
}