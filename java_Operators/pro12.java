import java.util.Scanner;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 1;
        for(int i = 1 ; i<=b ; i++){
             sum = sum*2;
        }
        System.out.println("Compressed Size : "+a/sum);
    }
}
