import java.util.Scanner;
public class prob15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int usercount = sc.nextInt();
        String type = sc.next();
        String suplevel = sc.next();
        int year = sc.nextInt();

        double baseprice = 0;
        if(type.equals("Standard")){
            baseprice = 60;
        }else if(type.equals("Professional")){
            baseprice = 120;
        }else if(type.equals("Enterprise")){
            baseprice = 200;
        }

        int volumedis = 0;
        if(usercount>=1 && usercount<=50){
            volumedis = 0;
        }else if(usercount>=51 && usercount<=200){
            volumedis = 15;
        }else if(usercount>=201 && usercount<=500){
            volumedis = 20;
        }else if(usercount>=501 && usercount<=1000){
            volumedis = 25;
        }else if(usercount>1000){
            volumedis = 35;
        }

        double supfee =  0;
        if(suplevel.equals("Basic")){
            supfee = 10;
        }else if(suplevel.equals("Priority")){
            supfee = 30;
        }else if(suplevel.equals("Premium")){
            supfee = 80;
        }

        int muldis = 0;
        if(year==1){
            muldis = 0;
        }else if(year==2){
            muldis = 5;
        }else if(year==3){
            muldis = 10;
        }else if(year==5){
            muldis = 20;
        }

        double disbase = baseprice*(1-volumedis/100.0);
        double annualperuser = (disbase+supfee)*(1-muldis/100.0);
        double totann = annualperuser*usercount;
        double contractvalue = totann*year;

        String pricetire = "";
        if(usercount<200){
            pricetire = "Small Business";
        }else if(usercount>=200 && usercount<=1000){
            pricetire = "Mid-Market";
        }else if(usercount>1000){
            pricetire = "Enterprise";
        }

        System.out.println("User Count : "+usercount);
        System.out.println("License Type : "+type);
        System.out.println("Support Level : "+suplevel);
        System.out.println("Contract Duration : "+year+" years");
        System.out.println("Base Price Per User : $"+baseprice);
        System.out.println("Volume Discount : "+volumedis+"%");
        System.out.println("Support Fee Per User : $"+supfee);
        System.out.println("Multi-Year Discount : "+muldis+"%");
        System.out.printf("Annual Cost Per User : $%.2f\n",annualperuser);
        System.out.printf("Total Annual Cost : $%.2f\n",totann);
        System.out.printf("Total Contract Value : $%.2f\n",contractvalue);
        System.out.println("Pricing Tier : "+pricetire);

        sc.close();
    }
}
