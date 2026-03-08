import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double salesum = 0;
        double comsum = 0; 
        String save = "";
        double max = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            double amount = sc.nextDouble();
            int comrate = 0;
            if(amount >=0 && amount<=40000){
                comrate = 5;
            }else if(amount>=40001 && amount<=80000){
                comrate = 8;
            }else if(amount>=80001 && amount<=100000){
                comrate = 10;
            }else if(amount>=100001 && amount<=150000){
                comrate = 12;
            }else if(amount>150000){
                comrate = 15;
            }

            double commision = amount*(comrate/100.0);
            double bonus = 0;
            if(amount>=150000){
                bonus = 3000;
            }else if(amount>=100000){
                bonus = 2000;
            }
            double totpay = bonus+commision;
            salesum = salesum+amount;
            comsum = comsum+commision;
            if(max<amount){
                max = amount;
                save = name;
            }

            System.out.println("Sales Rep : "+name);
            System.out.println("Sales Amount : $"+amount);
            System.out.println("Commission Rate + "+comrate+"%");
            System.out.println("Commission Earned : $"+commision);
            System.out.println("Bonus : $"+bonus);
            System.out.println("Total Payout : $"+totpay);
            System.out.println();
        }
        System.out.println("Total Sales Reps : "+n);
        System.out.println("Total Sales : $"+salesum);
        System.out.println("Total Commissions : $"+comsum);
        System.out.println("Top Performer : "+save);
        sc.close();
    }
}
