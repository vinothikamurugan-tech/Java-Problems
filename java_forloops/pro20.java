import java.util.Scanner;
public class pro20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tran = 1;
        double depcount = 0;
        double withcount = 0;
        double transcount = 0;
        double paymentcount = 0;
        for(int i = 0; i<n ; i++){
            String type = sc.next();
            double amount = sc.nextDouble();

            System.out.println("Transaction "+tran+" : "+type);
            tran++;
            System.out.println("Amount : $"+amount);

            if(type.equals("Deposit")){
                depcount = depcount+amount;
                System.out.println("Category : Credit");
            }else{
                System.out.println("Category : Debit");
                if(type.equals("Withdrawal")){
                    withcount = withcount+amount;
                }else if(type.equals("Transfer")){
                    transcount = transcount+amount;
                }else if(type.equals("Payment")){
                    paymentcount = paymentcount+amount;
                }
            }
            System.out.println();
        }

        System.out.println("Total Transactions : "+n);
        System.out.println("Total Deposits : $"+depcount);
        System.out.println("Total Withdrawals : $"+withcount);
        System.out.println("Total Transfers : $"+transcount);
        System.out.println("Total Payments : $"+paymentcount);
        double netbalance = depcount-(withcount+transcount+paymentcount);
        System.out.println("Net Balance Change : $"+netbalance);  
        sc.close();
    }
}
