import java.util.Scanner;

public class MédiaDecimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        double num3 = scanner.nextInt(); 

        double soma = num1 + num2 + num3;
        double media = soma / 3; 
        System.out.println("A média dos números é: " + media);
        scanner.close();


    }
}
