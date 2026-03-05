import java.util.Scanner;
public class prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String status = sc.next();
        double orderval = sc.nextDouble();
        String timeslot = sc.next();

        int basedis = 0;
        if(status.equals("Gold")){
            basedis = 15;
        }else if(status.equals("Silver")){
            basedis = 10;
        }else if(status.equals("Bronze")){
            basedis = 5;
        }else if(status.equals("None")){
            basedis = 0;
        }

        int tba = 0;
        if((timeslot.equals("Peak")) || (timeslot.equals("Regular"))){
            tba = 0;
        }else{
            tba = -5;
        }
        
        double serfee = 0;
        if(type.equals("Delivery")){
            serfee = orderval*0.10;
        }else if(type.equals("Takeout")){
            serfee = orderval*0.03;
        }

        double disvalue = orderval*(1-basedis/100.0);
        double finalamount = disvalue+serfee;
        
        String priority = "";
        if((timeslot.equals("Peak")) && (type.equals("Delivery"))){
            priority = "High";
        }else if(timeslot.equals("Regular")){
            priority = "Medium";
        }else if(timeslot.equals("Late-Night")){
            priority = "Low";
        }
        
        int estime = 0;
        if(priority.equals("High")){
            if(type.equals("Delivery")){
                estime = 30;
            }else{
                estime = 25;
            }
        }else if(priority.equals("Medium")){
            estime = 20;
        }else{
            estime = 15;
        }

        System.out.println("Order Type : "+type);
        System.out.println("Loyalty Status : "+status);
        System.out.println("Order Value : $"+orderval);
        System.out.println("Time Slot : "+timeslot);
        System.out.println("Base Discount : "+basedis+"%");
        System.out.println("Time-Based Adjustment : "+tba+"%");
        System.out.printf("Service Fee : $%.1f\n",serfee);
        System.out.println("Final Amount : $"+finalamount);
        System.out.println("Kitchen Priority : "+priority);
        System.out.println("Estimated Prep Time : "+estime+" minutes");
        
        sc.close();
    }
}
