import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int percent = sc.nextInt();
        if(hour>40 && percent>90){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
