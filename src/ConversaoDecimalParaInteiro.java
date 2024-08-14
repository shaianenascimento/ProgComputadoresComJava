import java.util.Scanner; //importar biblioteca scanner//

public class ConversaoDecimalParaInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // crieei objeto scanner para ler entrada no teclado //
        System.out.print("Digite um número decimal: "); //solicitei//
        double numeroDecimal = scanner.nextDouble(); //decimal lido como double //
        int numeroInteiro = (int) numeroDecimal; //conversão//
        System.out.println("Número inteiro após conversão: " + numeroInteiro);
        scanner.close();
    }
}
