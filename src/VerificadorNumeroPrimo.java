import java.util.Scanner;

public class VerificadorNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é primo
        if (isPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
    
    // Método para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        if (numero == 2) {
            return true; // 2 é o único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Números pares maiores que 2 não são primos
        }
        
        // Verifica os divisores até a raiz quadrada do número
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
