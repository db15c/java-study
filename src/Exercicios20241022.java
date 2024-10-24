import java.util.Locale;
import java.util.Scanner;

public class Exercicios20241022 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercício 1");
        System.out.println("Digite um número");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número");
        int numeroDois = scanner.nextInt();
        int somaDoisNumeros = numeroUm + numeroDois;
        System.out.printf("SOMA = %d %n", somaDoisNumeros);
        System.out.println("teste");

        System.out.println("""
                ___________________________________
                Exercício 2
   
                """);
        System.out.println("digite o valor do raio de um círculo");
        double raioCirculo = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

        System.out.printf("A = %.4f %n", areaCirculo);

        System.out.println("""
                ___________________________________
                Exercício 3
   
                """);
        System.out.println("Insira um número inteiro: ");
        int numeroA = scanner.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int numeroB = scanner.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int numeroC = scanner.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int numeroD = scanner.nextInt();

        int valorDiferencaProdutos = (numeroA * numeroB) - (numeroC * numeroD);
        System.out.printf("O valor da diferença: %d %n", valorDiferencaProdutos);


        scanner.close();
    }
}
