public class TabuadaDe10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            // Loop para multiplicar o número atual por 1 a 10
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.printf("%d x %d = %d\n", i, j, resultado);
            }
    }
    
    }
}
