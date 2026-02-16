import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tot = sc.nextDouble();
        double charge = sc.nextDouble();
        double gst = sc.nextDouble();
        double person = sc.nextDouble();
        double a = tot*charge/100;
        double b = tot+a;
        double c = b*gst/100;
        double d = b+c;
        double finalAmount = d/person;
        System.out.printf("Amount per Person : %.2f",finalAmount);

    }
}
