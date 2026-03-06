import java.util.Scanner;
public class prob14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String membertier = sc.next();
        int months = sc.nextInt();
        String acceslevel = sc.next();
        String addons = sc.next();

        double monthlyfee = 0;
        if(membertier.equals("Basic")){
            monthlyfee = 40;
        }else if(membertier.equals("Premium")){
            monthlyfee = 80;
        }else if(membertier.equals("Elite")){
            monthlyfee = 120;
        }else if(membertier.equals("VIP")){
            monthlyfee = 150;
        }

        int contractdis = 0;
        if(months==1){
            contractdis = 0;
        }else if(months==6){
            contractdis = 10;
        }else if(months==12){
            contractdis = 15;
        }else if(months==24){
            contractdis = 25;
        }

        double accesfee = 0;
        if(acceslevel.equals("Single-Location")){
            accesfee = 0;
        }else if(acceslevel.equals("Regional")){
            accesfee = 20;
        }else if(acceslevel.equals("Nationwide")){
            accesfee = 50;
        }

        double addonfee = 0;
        if(addons.equals("None")){
            addonfee = 0;
        }else if(addons.equals("Personal-Training")){
            addonfee = 100;
        }else if(addons.equals("Classes")){
            addonfee = 50;
        }else if(addons.equals("Full-Package")){
            addonfee = 200;
        }

        double disbase = monthlyfee*(1-contractdis/100.0);
        double monthtot = disbase+accesfee+addonfee;
        double contracttot = monthtot*months;
        double saving = (monthlyfee+accesfee+addonfee)*months-contracttot;

        String category = "";
        if(membertier.equals("Premium")){
            if(monthtot<=150){
                category = "Standard";
            }else{
                category = "Premium";
            }
        }else if(membertier.equals("Elite")){
            category = "Premium";
        }else if(membertier.equals("VIP")){
            category = "Luxury";
        }else if(membertier.equals("Basic")){
            category = "Budget";
        }

        System.out.println("Membership Tier : "+membertier);
        System.out.println("Contract Length : "+months+" months");
        System.out.println("Access Level : "+acceslevel);
        System.out.println("Add-Ons : "+addons);
        System.out.println("Base Monthly Fee : $"+monthlyfee);
        System.out.println("Contract Discount : "+contractdis+"%");
        System.out.println("Access Fee : $"+accesfee);
        System.out.println("Add-On Fee : $"+addonfee);
        System.out.println("Monthly Total : $"+monthtot);
        System.out.println("Contract Total : $"+contracttot);
        System.out.println("Savings vs Month-to-Month : $"+saving);
        System.out.println("Membership Category : "+category);

        sc.close();
    }
}
