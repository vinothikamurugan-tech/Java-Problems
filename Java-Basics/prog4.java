import java.util.Scanner;
public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tufee = sc.nextInt();
        int scho = sc.nextInt();
        int exfee = sc.nextInt();
        int libfee = sc.nextInt();
        int a = tufee*scho/100;
        int amount = tufee-a;
        int total = amount+exfee+libfee;
        System.out.println("Final Payable Fee : "+total);ava
    }
}
