import java.util.Scanner;

/**
 * NovoCaractere
 */
public class NovoCaractere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita a string 
        System.out.print("Digite uma palavra: ");
        String texto = scanner.nextLine();

        // Solicita o caractere a ser substituído
        System.out.print("Digite o caractere a ser substituído: ");
        char caractereAntigo = scanner.next().charAt(0); 
        /*charAt(int index): Esse método retorna o caractere que está 
        na posição especificada pelo índice dentro da string.*/

        // Solicita o novo caractere
        System.out.print("Digite o novo caractere: ");
        char caractereNovo = scanner.next().charAt(0);

        // Substitui o caractere na string
        String resultado = texto.replace(caractereAntigo, caractereNovo);

        // Exibe o resultado
        System.out.println("String resultante: " + resultado);
    }
}