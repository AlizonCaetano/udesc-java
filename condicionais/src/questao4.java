//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = S.nextInt();
        String msg = "";

        if(idade < 16) {
            msg = "Não eleitor";
        }else if (idade >= 18 && idade <= 65){
            msg = "Eleitor obrigatório";
        } else if (idade >= 16 && idade <= 17 || idade >= 65){
            msg = "Eleitor facultativo";
        }

        System.out.println("Classe eleitoral: " + msg);
    }
}