import java.util.Scanner;
public class prog22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int fin = (a*b)+c+d-e-f;
        System.out.println("Publishing Profit : "+fin);
    }
}
