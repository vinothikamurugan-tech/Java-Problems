import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int username = sc.nextInt();
        int password = sc.nextInt();
        int lock = sc.nextInt();
        if(username==password && lock!=username){
            System.out.println("Success");
        }else{
            System.out.println("Failed");
        }
    }
}
