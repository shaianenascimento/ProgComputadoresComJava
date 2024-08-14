import java.util.Scanner;

public class CalculadoraNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro  ");
        int numUm = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro  ");
        int numDois = scanner.nextInt();

        int soma = numUm + numDois;
        int subtrai = numUm - numDois;
        int multiplica = numUm * numDois;
        int divide = numUm / numDois;
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da multiplicação é: " + multiplica);
        System.out.println("O resultado da subtração é: " + subtrai);
        System.out.println("O resultado da divisão é: " + divide);
        scanner.close();
    }
    


    
}