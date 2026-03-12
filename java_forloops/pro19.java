import java.util.Scanner;
public class pro19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int expiredcount = 0;
        int sooncount = 0;
        int activecount = 0;
        for(int i = 0; i<n ; i++){
            String proID = sc.next();
            String protype = sc.next();
            int months = sc.nextInt();

            System.out.println("Product ID : "+proID);
            System.out.println("Type : "+protype);
            int varanty = 0;
            if(protype.equals("Electronics")){
                varanty = 12;
                System.out.println("Warranty Period : 12 Months");
            }else if(protype.equals("Appliance")){
                varanty = 24;
                System.out.println("Warranty Period : 24 Months");
            }else if(protype.equals("Computer")){
                varanty = 36;
                System.out.println("Warranty Period : 36 Months");
            }

            System.out.println("Months Used : "+months+" months");
            int rem = 0;
            if(varanty<months || varanty==months){
                rem = 0;
                System.out.println("Remaining : 0 months");
            }else if(varanty>months){
                rem = varanty-months;
                System.out.println("Remaining : "+rem+" months");
            }

            if(rem==0){
                expiredcount++;
                System.out.println("Status : Expired");
            }else if(rem>=1 && rem<=3){
                sooncount++;
                System.out.println("Status : Expiring Soon");
            }else if(rem>3){
                activecount++;
                System.out.println("Status : Active");
            }
            System.out.println();
        }

        System.out.println("Total Products : "+n);
        System.out.println("Active Warranties : "+activecount);
        System.out.println("Expiring Soon : "+sooncount);
        System.out.println("Expired Warranties : "+expiredcount);
        sc.close();
    }
}
