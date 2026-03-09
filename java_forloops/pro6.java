import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialbal = sc.nextDouble();
        double finalbal = initialbal;
        int n = sc.nextInt();
        int success = 0;
        int fail = 0;
        int transaction = 1;
        for(int i = 0; i<n ; i++){
            double withdraw = sc.nextDouble();
            String status = "";
            if(withdraw<=initialbal){
                success++;
                initialbal = initialbal-withdraw;
                status = "Approved";
                System.out.println("Transaction "+transaction+" : $"+withdraw);
                System.out.println("Status : "+status);
                System.out.println("Remaining Balance : $"+initialbal);
                System.out.println();
                transaction++;
            }else{
                fail++;
                System.out.println("Transaction "+transaction+" : $"+withdraw);
                System.out.println("Status : Denied");
                System.out.println("Reason : Insufficient funds");
                System.out.println("Remaining Balance : $"+initialbal);
                System.out.println();
                transaction++;
            }
        }
        System.out.println("Total Transactions : "+n);
        System.out.println("Successful Withdrawals : "+success);
        System.out.println("Failed Withdrawals : "+fail);
        System.out.println("Final Balance : $"+initialbal);
        double a = finalbal-initialbal;
        System.out.println("Total Withdrawn : $"+a);
        sc.close();
    }
}
