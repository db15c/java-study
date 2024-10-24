import java.util.Locale;
import java.util.Scanner;

public class Exercicios20241023 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 1 - Positive or Negative number?");
        System.out.println("Input a int number: ");
        int intNumber = scanner.nextInt();
        System.out.println(intNumber < 0 ? "R: Negative" : "R: Positive");

        System.out.println("Exercise 2 - even or odd ");
        System.out.println("input a int number: ");
        int evenOrOdd = scanner.nextInt();
        System.out.println((evenOrOdd % 2 == 0) ? "Even" : "Odd");

        System.out.println("Exercise 3 - multiple ");
        System.out.println("Input a int numer: ");
        int firstMultiple = scanner.nextInt();
        System.out.println("Input another one: ");
        int secondMultiple = scanner.nextInt();
        if (firstMultiple >= secondMultiple) {
            System.out.println((firstMultiple % secondMultiple == 0) ? "Multiple" : "is not multiple");
        } else {
            System.out.println((secondMultiple % firstMultiple == 0) ? "Multiple" : "is not multiple");
        }

        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */
        System.out.println("Exercise 4 - duration ");
        System.out.println("Input a int hour for start play (24 hours format): ");
        int startPlayTime = scanner.nextInt();
        System.out.println("Input a int hour for finish play (24 hours format): ");
        int finishPlayTime = scanner.nextInt();
        if (startPlayTime >= finishPlayTime) {
            System.out.println(finishPlayTime + 24 - startPlayTime + "Hour(s)");
        }  else if (startPlayTime < finishPlayTime) {
            System.out.println(finishPlayTime - startPlayTime + "Hour(s)");
        } else {
            System.out.println("please check your input, some error ocurred.");
        }

        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
         */
        System.out.println("Exercise 5 - menu ");
        int itensMenu = scanner.nextInt();
        System.out.println("""
                1 - Cachorro Quente R$4.00
                2 - X-Salada R$4.50
                3 - X-Bacon R$5.00
                4 - Torrada Simples R$2.00
                5 - Refrigerante R$1.50
                """);
        System.out.print("Digite o código do item: ");
        int itemCodigo = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double conta = 0;

        switch (itemCodigo) {
            case 1 -> conta = 4.00 * quantidade;
            case 2 -> conta = 4.50 * quantidade;
            case 3 -> conta = 5.00 * quantidade;
            case 4 -> conta = 2.00 * quantidade;
            case 5 -> conta = 1.50 * quantidade;
            default -> {
                System.out.println("Opção inválida");
                scanner.close();
                return;
            }
        }

        System.out.printf("O valor total da conta é: R$ %.2f %n", conta);

        System.out.println("Exercise 6 - Intervals");
        double inputInterval = scanner.nextDouble();
        if (inputInterval >= 0 && inputInterval < 25){
            System.out.println("[0,25]");
        } else if (inputInterval > 25 && inputInterval < 50){
            System.out.println("(25, 50]");
        } else if (inputInterval >= 50 && inputInterval < 75){
            System.out.println("(50, 75]");
        } else if (inputInterval >=75 && inputInterval <=100){
            System.out.println("(75, 100]");
        } else {
            System.out.println("fora do intervalo");
        }


        System.out.println("Exercise 7 - x and y axis");
        double xCoordinate = scanner.nextDouble();
        double yCoordinate = scanner.nextDouble();

        if (xCoordinate == 0 && yCoordinate == 0){
            System.out.println("Origem");
        } else if(xCoordinate == 0){
            System.out.println("Y axis");
        } else if (yCoordinate == 0){
            System.out.println("X axis");
        }else if (xCoordinate >0 && yCoordinate >0){
            System.out.println("Q1");
        } else if (xCoordinate <0 && yCoordinate >0) {
            System.out.println("Q2");
        } else if (xCoordinate <0 && yCoordinate <0) {
            System.out.println("Q3");
        }else if (xCoordinate >0 && yCoordinate <0) {
            System.out.println("Q4");
        }else {
            System.out.println("try again");
        }

        


        scanner.close();
    }
}
