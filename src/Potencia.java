import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero da base");
        double base = scanner.nextDouble();

        System.out.println("Digite o numero do expoente");
        double expo = scanner.nextDouble();


        double resultado = Math.pow(base, expo);
        System.out.println("O valor da potencia é:  " + resultado);


    }
}

