//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = S.nextInt();
        String msg = "";

        if(numero % 2 == 0) {
            msg = "É divisivel";
        } else {
            msg = "Não é divisivel";
        }

        System.out.println("Resultado: " + msg);
    }
}