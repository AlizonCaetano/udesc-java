//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int input = S.nextInt();

        String dia = "";

        String d1 = "Domingo";
        String d2 = "Segunda-feira";
        String d3 = "Terça-feira";
        String d4 = "Quarta-feira";
        String d5 = "Quinta-feira";
        String d6 = "Sexta-feira";
        String d7 = "Sábado";

        if (input == 1) { dia = d1; }
        if (input == 2) { dia = d2; }
        if (input == 3) { dia = d3; }
        if (input == 4) { dia = d4; }
        if (input == 5) { dia = d5; }
        if (input == 6) { dia = d6; }
        if (input == 7) { dia = d7; }

        System.out.println("Dia da semana: " + dia);
    }
}