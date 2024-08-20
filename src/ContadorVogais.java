import java.util.Scanner;

    public class ContadorVogais {
    
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite uma frase: ");
            String frase = scanner.nextLine();
            scanner.close();
            
            // Definindo as vogais
            String vogais = "aeiouAEIOU";
            int contador = 0;
            
            // Itera sobre cada caractere da frase
            for (int i = 0; i < frase.length(); i++) {
                char caractere = frase.charAt(i);
                // Verifica se o caractere é uma vogal
                if (vogais.indexOf(caractere) != -1) {
                    contador++;
                }
            }
            System.out.println("Número de vogais na frase: " + contador);
        }
    }    
