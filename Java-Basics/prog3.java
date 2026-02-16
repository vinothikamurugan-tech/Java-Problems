import java.util.Scanner;
public class prog3 {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int sale = sc.nextInt();
        int dis = sc.nextInt();
        int gst = sc.nextInt();
        int a = sale*dis/100;
        int b = sale-a;
        int cal = b*gst/100;
        int total = b+cal;
        System.out.println("Final Amount "+total);
     }
}