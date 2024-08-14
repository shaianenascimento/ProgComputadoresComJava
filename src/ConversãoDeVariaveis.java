import java.util.Scanner;

public class ConversãoDeVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numD = scanner.nextDouble();
        String numString = " " + numD;
        System.out.println(numString);
        scanner.close();

    }
}
