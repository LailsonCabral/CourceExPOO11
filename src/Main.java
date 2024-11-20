import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        Rectangle retangulo = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.printf("AREA =  %.2f%n", retangulo.Area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
    }
}