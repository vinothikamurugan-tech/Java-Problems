import java.util.Scanner;
public class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int mil = sc.nextInt();
        int fuel = sc.nextInt();
        int tool = sc.nextInt();
        int km = dis/mil;
        int a = km*fuel;
        int amount = a+tool;
        System.out.println("Total Trip Cost : "+amount);
    }
}
