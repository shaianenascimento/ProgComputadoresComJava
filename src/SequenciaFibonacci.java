public class SequenciaFibonacci {

    public static void main(String[] args) {
        // os primeiros dois números da sequência de Fibonacci
        int a = 0;
        int b = 1;
        
        // Imprime os números de Fibonacci menores que 100
        System.out.println("Sequência de Fibonacci menores que 100:");
        
        // Loop para gerar e imprimir os números da sequência
        while (a < 100) {
            // Imprime o número atual
            System.out.println(a);
            
            // Calcular o próximo número
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}