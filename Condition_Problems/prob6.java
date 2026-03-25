import java.util.Scanner;
public class prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String boclass = sc.next();
        int days = sc.nextInt();
        double seat = sc.nextDouble();
        String type = sc.next();

        int set = 0;
        if(type.equals("Domestic")){
            set = 1;
        }
        if(type.equals("International-Short")){
            set = 2;
        }
        if(type.equals("International-Long")){
            set = 3;
        }
        double baseprice = 0;
        if(boclass.equals("Economy")){ 
            if(set==1){
                baseprice = 200;
            }
            if(set==2){
                baseprice = 500;
            }
            if(set==3){
                baseprice = 800;
            }
        }
        if(boclass.equals("Business")){
            if(set==1){
                baseprice = 600;
            }
            if(set==2){
                baseprice = 1500;
            }
            if(set==3){
                baseprice = 2500;
            }
        }
        if(boclass.equals("First")){
            if(set==1){
                baseprice = 1000;
            }
            if(set==2){
                baseprice = 3000;
            }
            if(set==3){
                baseprice = 5000;
            }
        }

        double demul = 0;
        String demand = "" ;
        if(seat<30 && days<14){
            demul = 1.8;
            demand = "High Demand";
        }else if(seat<50 && days<30){
            demul =1.5;
            demand = "High Demand"; 
        }else if(seat<60 || (days>=30 && days<=60)){
            demul = 1.0;
            demand = "Moderate";
        }else if(seat>=60 && days>60){
            demul = 0.8;
            demand = "Low Demand";
        }

        double finalprice = baseprice*demul;
        System.out.println("Booking Class : "+boclass);
        System.out.println("Days Until Departure : "+days);
        System.out.println("Seat Availability : "+seat+"%");
        System.out.println("Route Type : "+type);
        System.out.println("Base Price : $"+baseprice);
        System.out.println("Demand Multiplier : "+demul+"x");
        System.out.println("Final Ticket Price : $"+finalprice);
        System.out.println("Pricing Category : "+demand);
        sc.close();
    }
}
