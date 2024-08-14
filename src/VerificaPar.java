import java.util.Scanner;

public class VerificaPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número que deseja verificar?: ");
        int num = scanner.nextInt();

        boolean par = num  % 2 == 0;
        if (par) {
        System.out.println("O numero é par");
        } else {
        System.out.println("O numero não é par");
        }
        scanner.close();
    }
}
