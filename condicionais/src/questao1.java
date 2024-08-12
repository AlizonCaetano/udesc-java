//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = S.nextInt();
        String resultado = "";
        resultado = "O valor não é divisivel por 2, 5 ou 10";

        if (valor % 10 == 0 && valor % 5 == 0) {
            resultado = "O valor é divisivel por 10 e 5";
        } else if (valor % 10 == 0 && valor % 2 == 0) {
            resultado = "O valor é divisivel por 10 e 2";
        } else if (valor % 10 == 0){
            resultado = "O valor é divisivel por 10";
        }

        if (valor % 5 == 0 && valor % 2 == 0) {
            resultado = "O valor é divisivel por 5 e 2";
        } else if (valor % 5 == 0){
            resultado = "O valor é divisivel por 5";
        }

        if (valor % 2 == 0) {
            resultado = "O valor é divisivel por 2";
        }

        if(valor % 10 == 0 && valor % 5 == 0 && valor % 2 == 0) {
            resultado = "O valor divisivel é por 2, 5 ou 10";
        }

        System.out.println("Resultado: " + resultado);
    }
}