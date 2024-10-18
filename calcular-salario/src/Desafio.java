import java.util.Scanner;

public class Desafio {
 
    public static void main(String[] args) {
        
        //Lê os valores de entrada
        Scanner leitoDeEntradas = new Scanner(System.in);

        System.out.println("Informe o valor do sálario:");
        double valorSalario = leitoDeEntradas.nextDouble();
        System.out.println("Informe o valor do benefício:");
        double valorBeneficio = leitoDeEntradas.nextDouble();

        double valorImposto = 0.0;

        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println("O valor liquido será de: ");
        System.out.println(String.format("%.2f", saida));

        leitoDeEntradas.close();

    }

}
