import java.util.Scanner;

/**
 * CalculadoraIMC
 */
public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em kg");
        double peso = scanner.nextDouble(); 
        System.out.println("Digite a sua altura em metros");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura); 
        System.out.print("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está com o peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        scanner.close();

    }
}