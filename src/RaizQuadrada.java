import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para descobrir a raiz quadrada");
        double raiz = scanner.nextDouble();

        double resultado = Math.sqrt(raiz);
        System.out.println("A raiz quadrada de " + raiz + " é: " + resultado);


    }
}
