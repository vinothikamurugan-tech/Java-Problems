import java.util.Scanner;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String status = sc.next();
        String condition = sc.next();
        String tier = sc.next();
        int group = 0;
        if(age>=18 && age<=30){
            group = 1;
        }else if(age>=31 && age<=50){
            group = 2;
        }else if(age>=51 && age<=65){
            group = 3;
        }else if(age>66){
            group = 4;
        }
        double base = 0;
        if((tier.equals("Basic")) || (tier.equals("basic"))){
            if(group==1){
                base = 200;
            }else if(group==2){
                base = 250;
            }else if(group==3){
                base = 350;
            }else if(group==4){
                base = 400;
            }
        }
        if((tier.equals("Standard")) || (tier.equals("standard"))){
            if(group==1){
                base = 300;
            }else if(group==2){
                base = 350;
            }else if(group==3){
                base = 450;
            }else if(group==4){
                base = 550;
            }
        }
        if((tier.equals("Premium")) || (tier.equals("premium"))){
            if(group==1){
                base = 500;
            }else if(group==2){
                base = 600;
            }else if(group==3){
                base = 700;
            }else if(group==4){
                base = 800;
            }
        }
        double surcharge = 0;
        int flag = 1;

        if((status.equals("Smoker")) || (status.equals("smoker"))){
                flag = 0;
        }
        if(flag==0 && ((condition.equals("Yes")) || (condition.equals("yes")))){
            double a = base*70/100;
            surcharge = a+base; 
        }else if((condition.equals("Yes")) || (condition.equals("yes"))){
            double b = base*30/100;
            surcharge = b+base;
        }else if(flag==0){
            double c = base*40/100;
            surcharge = c+base;
        }
        double totalprem = base+surcharge;
        System.out.println("Age : "+age);
        System.out.println("Smoking Status : "+status);
        System.out.println("Pre-existing Conditions : "+condition);
        System.out.println("Coverage Tier : "+tier);
        System.out.println("Base Premium : $"+base);
        System.out.println("Risk Surcharge : $"+surcharge);
        System.out.println("Total Monthly Premium : $"+totalprem);
    }
}
