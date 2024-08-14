import java.util.Scanner;

public class StringMaiuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String texto = scanner.nextLine();

        System.out.println(texto.toUpperCase());
    }
}
