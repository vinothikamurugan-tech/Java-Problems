import java.util.Scanner;
public class pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double sum = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            String type = sc.next();
            int days = sc.nextInt();

            System.out.println("Member : "+name);
            System.out.println("Membership : "+type);
            System.out.println("Days Until Expiry : "+days);
            double renuw = 0;
            if(type.equals("Basic")){
                renuw = 50;
            }else if(type.equals("Premium")){
                renuw = 100;
            }else if(type.equals("VIP")){
                renuw = 200;
            }

            System.out.println("Renewal Fee : $"+renuw);

            int discount = 0;
            if(days>=45){
                discount = 20;
            }else if(days>=30 && days<=44){
                discount = 15;
            }else if(days>=15 && days<=29){
                discount = 10;
            }else if(days<15){
                discount = 0;
            }

            System.out.println("Discount : "+discount+"%");

            double finalfee = renuw*(1-discount/100.0);
            System.out.printf("Final Fee : $%.1f\n",finalfee);

            sum = sum+finalfee;
            if(days<10){
                System.out.println("Priority : Urgent");
                count++;
            }else if(days>=10 && days<=30){
                System.out.println("Priority : High");
            }else if(days>30){
                System.out.println("Priority : Normal");
            }
            System.out.println();
        }

        System.out.println("Total Members : "+n);
        System.out.println("Urgent Renewals : "+count);
        System.out.println("Total Renewal Revenue : $"+sum);
        System.out.printf("Average Renewal Fee : $%.1f\n",sum/n);
        sc.close();

    }
}
