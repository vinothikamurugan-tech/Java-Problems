import java.util.Scanner;
public class prog25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int last = (a*b)+(c*d)+e+f-g-h;
        System.out.println("Net Water Revenue : "+last);
    }
}
