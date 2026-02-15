import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double base = sc.nextDouble();
       double extragb = sc.nextDouble();
       double gbper = sc.nextDouble();
       double tax = sc.nextDouble();
       double a = extragb*gbper;
       double b = base+a;
       double bill = b*tax/100;
       double total = b+bill;
       System.out.printf("Total Bill : %.2f",total);
    }
}