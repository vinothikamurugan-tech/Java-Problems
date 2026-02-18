import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int amount = sc.nextInt();
        int card = sc.nextInt();
        if(amount<=limit && card==0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}
