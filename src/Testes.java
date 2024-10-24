import java.util.Locale;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
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
