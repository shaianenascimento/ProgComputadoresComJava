import java.util.Scanner;

public class ComparaçãoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o 1º número que deseja verificar?: ");
        int num1 = scanner.nextInt();
        System.out.println("Qual o 2º número que deseja verificar?: ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("O número " + num1 + " é maior ou igual a " + num2);
        } else {
            System.out.println("O número " + num1 + " é menor que " + num2);
        }
        scanner.close();
    }
}
