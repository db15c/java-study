import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("""
                Products:
                Computer, wich price is $ %.2f
                Office desk, wich price is $ %.2f
                
                Record: %d years old, code %d and gender %s
                
                Measue with eight decimal places: %.8f
                Rounded (three decimal places): %.3f
                """, price1, price2, age, code, gender, measure, measure );

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);




    }
}