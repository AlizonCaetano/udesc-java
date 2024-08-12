//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int peso;
        int taxaMulta = 4;
        int limite = 500;
        double valorMulta;
        String msg = "";

        System.out.print("Peso pescado: ");
        peso = S.nextInt();

        if(peso > limite) {
            valorMulta = (peso-limite) * taxaMulta;
            msg = "Excesso de carga, multa no valor: " + valorMulta;
        } else {
            msg = "Não há multa por peso excedente de peso";
        }
        System.out.println(msg);
    }
}