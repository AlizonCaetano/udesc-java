//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Nota 1: ");
        int n1 = S.nextInt();

        System.out.print("Nota 2: ");
        int n2 = S.nextInt();

        System.out.print("Nota 3: ");
        int n3 = S.nextInt();

        System.out.print("Nota 4: ");
        int n4 = S.nextInt();

        System.out.print("Nota 5: ");
        int n5 = S.nextInt();

        String msg = "Notas acima da média:";

        double media = (n1 + n2 + n3 + n4 + n5) / 5;

        if (n1 > media) {
            msg = msg + "\n" + n1;
        }
        if (n2 > media) {
            msg = msg + "\n" + n2;
        }
        if (n3 > media) {
            msg = msg + "\n" + n3;
        }
        if (n4 > media) {
            msg = msg + "\n" + n4;
        }
        if (n5 > media) {
            msg = msg + "\n" + n5;
        }

        System.out.println(msg);

    }
}