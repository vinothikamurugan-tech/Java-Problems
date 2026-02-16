import java.util.Scanner;
public class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = a*b;
        int f = e+c;
        int fin = f-d;
        System.out.println("Final Weekly Wage : "+fin);

    }
}
