import java.util.Scanner;

public class mediaComOpcao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota1, nota2, nota3;
        double mediaFinal;

        System.out.print("Informe a primeira nota: ");
        nota1 = s.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = s.nextDouble();

        System.out.print("Informe a terceira nota: ");
        nota3 = s.nextDouble();

        mediaFinal = calculaMedia(nota1, nota2, nota3);

        System.out.println("A média final é: " + mediaFinal);
    }

    public static double calculaMedia(double n1, double n2, double n3) {
        Scanner m = new Scanner(System.in);
        String tipoMediaCalculo;
        int peso1, peso2, peso3;
        double notaPeso1, notaPeso2, notaPeso3;
        double mediaFinal = 0;

        System.out.println("Qual a forma de calculo de média?");
        System.out.println("[A] Aritmetica");
        System.out.println("[P] Ponderada");

        tipoMediaCalculo = m.next();

        if (tipoMediaCalculo.equals("A")) {
            mediaFinal = (n1 + n2 + n3) / 3;
        } else if (tipoMediaCalculo.equals("P")) {
            System.out.println("Informe o peso da nota 1: ");
            peso1 = m.nextInt();

            System.out.println("Informe o peso da nota 2: ");
            peso2 = m.nextInt();

            System.out.println("Informe o peso da nota 3: ");
            peso3 = m.nextInt();

            notaPeso1 = (peso1 * n1);
            notaPeso2 = (peso2 * n2);
            notaPeso3 = (peso3 * n3);
            mediaFinal = (notaPeso1 + notaPeso2 + notaPeso3)/10;
        }
        return mediaFinal;
    }
}