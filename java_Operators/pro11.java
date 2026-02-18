import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int level = sc.nextInt();
        int sum = 1;
        for(int i = 1 ; i<=level ; i++){
             sum = sum*2;
        }
        System.out.println("Capacity : "+sum*base);
    }
}
