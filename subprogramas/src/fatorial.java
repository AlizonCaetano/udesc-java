import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor a ser fatorado: ");
        int valor = s.nextInt();

        System.out.println("O valor fatorado é: " + fatorial(valor));
    }

    public static int fatorial(int valor) {
        int fatorial = 1;
        for(int i = 2; i <= valor; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
