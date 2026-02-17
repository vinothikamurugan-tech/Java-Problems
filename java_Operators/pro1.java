import java.util.Scanner;
public class pro1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int avg = (a+b)/2;
        if(a>=50 && b>=50 && avg>=60){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
