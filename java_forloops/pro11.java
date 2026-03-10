import java.util.Scanner;
public class pro11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sumprice = 0;
        double sumfinal = 0;
        int count = 1;
        for(int i = 0; i<n ; i++){
            String seattype = sc.next();
            String customertype = sc.next();

            double baseprice = 0;
            if(seattype.equals("Regular")){
                baseprice = 12;
            }else if(seattype.equals("Premium")){
                baseprice = 18;
            }else if(seattype.equals("Recliner")){
                baseprice = 25;
            }
            sumprice = sumprice+baseprice;

            int discount = 0;
            if(customertype.equals("Adult")){
                discount = 0;
            }else if(customertype.equals("Child")){
                discount = 30;
            }else if(customertype.equals("Senior")){
                discount = 25;
            }

            double finalprice = baseprice*(1-discount/100.0);
            sumfinal = sumfinal+finalprice;

            System.out.println("Ticket "+count+" : "+seattype+" - "+customertype);
            System.out.println("Base Price : $"+baseprice);
            System.out.println("Discount : "+discount+"%");
            System.out.printf("Final Price : $%.1f\n",finalprice);
            System.out.println();
            count++;
        }
        System.out.println("Total Tickets : "+n);
        System.out.println("Original Total : $"+sumprice);
        double a = sumprice-sumfinal;
        System.out.printf("Total Discount : $%.1f\n",a);
        if(n>=5){
            double b = sumfinal*0.10;
            double c = sumfinal-b;
            System.out.printf("Final Total : $%.2f\n",c);
            System.out.println("Group Discount Applied : Yes");
        }else if(n<5){
            System.out.println("Final Total : $"+sumfinal);
            System.out.println("Group Discount Applied : No");
        }
        sc.close();
    }
}
