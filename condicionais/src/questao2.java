//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Informe seu peso em KG(ex: 90): ");
        double peso = S.nextDouble();

        System.out.print("Informe sua altura em metros (ex: 1,84): ");
        double altura = S.nextDouble();

        double imc = peso/(altura*altura);

        String classificacao = "";

        if(imc < 18.5) {
            classificacao = "Magreza - Grau 0 de obesidade";
        }

        if(imc >= 18.5 && imc <= 24.9) {
            classificacao = "Normal - Grau 0 de obesidade";
        }

        if(imc >= 25.0 && imc <= 29.9) {
            classificacao = "Normal - Grau I de obesidade";
        }

        if(imc >= 30.0 && imc <= 34.9) {
            classificacao = "Obesidade - Grau I de obesidade";
        }

        if(imc >= 35.0 && imc <= 39.9) {
            classificacao = "Obesidade - Grau II de obesidade";
        }

        if(imc >= 40.0) {
            classificacao = "Obesidade - Grau III de obesidade";
        }

        System.out.println("Classificão: " + classificacao);
    }
}