//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.printf("Opções: \n[1] Vegetariano \n[2] Peixe \n[3] Frango \n[4] Carne\nSelecione a opção: ");
        int prato = S.nextInt();
        System.out.printf("Opções: \n[1] Abacaxi \n[2] Sorvete diet \n[3] Mouse diet \n[4]Mouse chocolate \nSelecione a opção: ");
        int sobremesa = S.nextInt();
        System.out.printf("Opções: \n[1] Chá\n[2] Suco de laranja \n[3] Suco de melão \n[4] Refrigerante diet\nSelecione a opção: ");
        int bebida = S.nextInt();

        int calorias = 0;

        int p1 = 180;
        int p2 = 230;
        int p3 = 250;
        int p4 = 350;

        int s1 = 75;
        int s2 = 110;
        int s3 = 170;
        int s4 = 200;

        int b1 = 20;
        int b2 = 70;
        int b3 = 100;
        int b4 = 65;

        if (prato == 1) { calorias = calorias + p1; }
        if (prato == 4) { calorias = calorias + p4; }
        if (prato == 2) { calorias = calorias + p2; }
        if (prato == 3) { calorias = calorias + p3; }

        if (sobremesa == 1) { calorias = calorias + s1; }
        if (sobremesa == 4) { calorias = calorias + s2; }
        if (sobremesa == 2) { calorias = calorias + s2; }
        if (sobremesa == 3) { calorias = calorias + s4; }

        if (bebida == 1) { calorias = calorias + b1; }
        if (bebida == 4) { calorias = calorias + b4; }
        if (bebida == 2) { calorias = calorias + b2; }
        if (bebida == 3) { calorias = calorias + b3; }


        System.out.println("Total calorias: " + calorias);
    }
}