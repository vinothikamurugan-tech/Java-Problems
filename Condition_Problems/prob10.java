import java.util.Scanner;
public class prob10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String timeday = sc.next();
        double power = sc.nextDouble();
        double reper = sc.nextDouble();
        String ratetire = sc.next();

        double baserate = 0;
        if(ratetire.equals("Basic")){
            baserate = 0.18;
        }else if(ratetire.equals("Time-of-Use")){
            baserate = 0.15;
        }else if(ratetire.equals("Premium-Green")){
            baserate = 0.12;
        }
        

        double ratemul = 0;
        String recom = " ";
        if(timeday.equals("Peak")){
            if(ratetire.equals("Time-of-Use")){
                ratemul = 1.8;
                recom = "Shift high-power appliances to Off-Peak hours";
            }else{
                ratemul = 1.5;
                recom = "Great renewable usage! Minor peak reduction possible";
            }
        }
        if(timeday.equals("Off-Peak")){
            if(ratetire.equals("Time-of-Use")){
                ratemul = 0.8;
                recom = "Good timing! Consider increasing";
            }else{
                ratemul = 1.0;
                recom = "Consider upgrading to Time-of-Use plan";
            }
        }
        if(timeday.equals("Super-Off-Peak")){
            if(ratetire.equals("Time-of-Use")){
                ratemul = 0.5;
            }else{
                ratemul = 0.6;
                recom = "Excellent! Maximize appliance use during this period";
            }
        }

        double recredit = (power*reper/100.0)*baserate;
        double cost = (power*baserate*ratemul)-recredit;
        
        System.out.println("Time of Day : "+timeday);
        System.out.println("Power Consumption : "+power+" kWh");
        System.out.println("Renewable Energy : "+reper+"%");
        System.out.println("Rate Tier : "+ratetire);
        System.out.println("Base Rate : $"+baserate+"/kWh");
        System.out.println("Rate Multiplier : "+ratemul+"x");
        System.out.printf("Renewable Credit : $%.2f\n",recredit);
        System.out.printf("Total Cost : $%.2f\n",cost);
        System.out.println("Optimization Recommendation : "+recom);

        sc.close();
    }
}
