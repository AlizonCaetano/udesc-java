//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = S.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = S.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = S.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = S.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        String resultado = "";

        if (media >= 7.0) {
            System.out.println("Média: " + media);
            resultado = "Aprovado!";

        } else if (media <= 6.9) {
            System.out.print("Nota Exame: ");
            double nExame = S.nextDouble();

            double recuperacao = (n1 + n2 + n3 + n4 + nExame) / 5;

            if (recuperacao >= 5.0) {
                System.out.println("Recuperação: " + recuperacao);

                System.out.println("Aprovado com exame!");
            }
        } else {
            System.out.println("Média: " + media);
            System.out.println("Reprovado!");
        }
    }
}