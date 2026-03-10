import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumquant = 0;
        double sumsubtot = 0;
        for(int i = 0; i<n ; i++){
            String itemname = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            sumquant = sumquant+quantity;

            double subtot = price*quantity;
            sumsubtot = sumsubtot+subtot;

            System.out.println("Item : "+itemname);
            System.out.println("Price : $"+price+" x "+quantity);
            System.out.println("Subtotal : $"+subtot);
            System.out.println();
        }
        System.out.println("Total Items : "+sumquant);
        System.out.println("Subtota : $"+sumsubtot);
        double a = sumsubtot*0.08;
        System.out.printf("Tax (8%%) : $%.2f\n",a);
        double b = sumsubtot*0.10;
        System.out.printf("Service Charge (10%%) : $%.2f\n",b);
        double sum = a+b+sumsubtot;
        System.out.printf("Grand Total : $%.2f\n",sum);
        sc.close();
    }
}
