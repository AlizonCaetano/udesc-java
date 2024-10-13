import java.util.Scanner;
import java.text.*;
public class pesoIdeal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe sua altura em centimetros: (ex. 1,80) ");
        double altura = s.nextDouble();

        System.out.println("Informe o seu sexo: [M] Masculino ou [F] Feminino");
        String sexo = s.next();

        System.out.println("O peso ideal é: " + pesoIdeal(altura, sexo));
    }

    public static String pesoIdeal(double altura, String sexo) {
        String resultado = "";
        DecimalFormat df = new DecimalFormat("##.##");

        if(sexo.equalsIgnoreCase("m")){
            double calculo = (72.7 * altura) - 58;
            resultado = df.format(calculo);
            resultado = String.valueOf(resultado);
        } else if(sexo.equalsIgnoreCase("f")){
            double calculo = (62.1 * altura) - 44.7;
            resultado = df.format(calculo);
            resultado = String.valueOf(resultado);
        }

        return resultado;
    }
}
