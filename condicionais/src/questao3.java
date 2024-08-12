//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Informe o Saldo médio: ");
        int saldoMedio = S.nextInt();
        double credito = 0;
        String msg = "";

        if(saldoMedio >= 0 && saldoMedio <= 500) {
            msg = "Saldo médio de " + saldoMedio + "\n [Sem crédito a liberar]";
        }
        if(saldoMedio >= 501 && saldoMedio <= 1000) {
            credito = (saldoMedio * 0.3);
            msg = "Saldo médio de " + saldoMedio + "\n [Crédito de 30%] R$ " + credito;
        }
        if(saldoMedio >= 1001 && saldoMedio <= 3000) {
            credito = (saldoMedio * 0.4);
            msg = "Saldo médio de " + saldoMedio + "\n [Crédito de 40%] R$ " + credito;
        }
        if(saldoMedio >= 3001) {
            credito = (saldoMedio * 0.5);
            msg = "Saldo médio de " + saldoMedio + "\n [Crédito de 50%] R$ " + credito;
        }

        System.out.println("Valor de crédito: " + msg);
    }
}