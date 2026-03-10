import java.util.Scanner;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int cou = 0;
        double totrev = 0;
        for(int i = 0; i<n ; i++){
            String type = sc.next();
            double hours = sc.nextDouble();

            if(hours>8){
                cou++;
            }

            double hourrate = 0;
            if(type.equals("Car")){
                hourrate = 3;
            }else if(type.equals("Motorcycle")){
                hourrate = 2;
            }else if(type.equals("Truck")){
                hourrate = 5;
            }else if(type.equals("Bus")){
                hourrate = 7;
            }

            System.out.println("Vehicle "+count+" : "+type);
            count++;
            System.out.println("Hours Parked : "+hours);
            System.out.println("Hourly Rate : $"+hourrate);

            double fee = hours*hourrate;
            double rate = 0;
            double finerate = 0;
            if(type.equals("Car")){
                rate = 30;
                if(rate>fee){
                    finerate = fee;
                }else{
                    finerate = rate;
                }
            }else if(type.equals("Motorcycle")){
                rate = 20;
                if(rate>fee){
                    finerate = fee;
                }else{
                    finerate = rate;
                }
            }else if(type.equals("Truck")){
                rate = 60;
                if(rate>fee){
                    finerate = fee;
                }else{
                    finerate = rate;
                }
            }else if(type.equals("Bus")){
                rate = 100;
                if(rate>fee){
                    finerate = fee;
                }else{
                    finerate = rate;
                }
            }
            totrev = totrev+finerate;
            if(finerate==fee){
                System.out.println("Parking Fee : $"+fee);
                System.out.println("Cap Applied : No");
            }else{
                System.out.println("Parking Fee : $"+finerate);
                System.out.println("Cap Applied : Yes");
            }
            System.out.println();
        }

        System.out.println("Total Vehicles : "+n);
        System.out.println("Total Revenue : $"+totrev);
        System.out.printf("Average Fee : $%.2f\n",totrev/n);
        System.out.println("Peak Hour Vehicles (>8 hours) : "+cou);
        sc.close();
    }
}
