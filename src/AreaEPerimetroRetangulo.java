import java.util.Scanner;

/**
 * AreaEPerimetroRetangulo
 */
public class AreaEPerimetroRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Qual a altura do retangulo em cm?: ");
        double altura = scanner.nextDouble();

        System.out.println("Qual a largura do retangulo em cm?: ");
        double largura = scanner.nextDouble();

        double area = largura * altura; 
        System.out.println("O tamanho da área é:  " + area);
        double perimetro = 2*(largura + altura);
        System.out.println("O tamnho do perimetro é: " + perimetro);
        scanner.close();

        
        
       
    }
}
