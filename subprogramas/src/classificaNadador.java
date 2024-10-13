import java.util.Scanner;

public class classificaNadador {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a idade do nadador(a): ");

        int idade = s.nextInt();

        System.out.println("A classificação do nadador é: " + classificador(idade));
    }

    public static String classificador(int idade) {
        String classificacao = "";

        if (idade >= 17)
            classificacao = "Adulto";
            else if (17 >= idade && idade >= 14)
                classificacao = "Juvenil B";
                else if(13 >= idade && idade >= 11)
                    classificacao = "Juvenil A";
                    else if(10 >= idade && idade >= 8)
                        classificacao = "Infantil B";
                        else if(7 >= idade && idade >= 5)
                            classificacao = "Infantil A";

        return classificacao;
    }
}
