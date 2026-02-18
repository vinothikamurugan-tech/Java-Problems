import java.util.Scanner;
public class pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int member = sc.nextInt();
        if(value>999 || member == 1){
            System.out.println("Free Shipping");
        }else{
            System.out.println("Charge Applied");
        }
    }
}
