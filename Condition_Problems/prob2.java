import java.util.Scanner;
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int credit = sc.nextInt();
        double income = sc.nextDouble();
        double ratio = sc.nextDouble();
        String loantype = sc.next();
        int a = 0;
        if(credit>=750){
            a = 5;
        }else if(credit>=700 && credit<=749){
            a = 4;
        }else if(credit>=650 && credit<=699){
            a = 3;
        }else if(credit<650){
            a = 2;
        }
        int b = 0;
        if(ratio<=30){
            b = 1;
        }else if(ratio>=31 && ratio<=40){
            b = 2;
        }else if(ratio>40){
            b = 3;
        }
        String status = "";
        double amount=0;
        if(loantype.equals("Home") || loantype.equals("home")){
             if(a==5 && b==1){
                status = "Approved";
                amount = 4*income;
             }else if(a==4 && b==2){
                status = "Needs Review";
                amount = 3*income;
             }
        }
        if(loantype.equals("Personal") || loantype.equals("personal")){
            if(a==5 && b==1){
                status = "Approved";
                amount = 1*income;
            }else if(a==3 && b==2){
                status = "Needs Review";
                amount = 0.5*income;
            }
        }
        if(loantype.equals("Business") || loantype.equals("business")){
            if((a==5 && b==1) || (a==5 && b==2) || (a==4 && b==1) || (a==4 && b==2)){
                status = "Approved";
                amount = 3*income;
            } 
        }
        if(credit<600 || ratio>50){
            status = "Rejected"; 
        }

        System.out.println("Credit Score : "+credit);
        System.out.println("Annual Income : $"+income);
        System.out.println("Debt-to-Income Ratio : "+ratio+"%");
        System.out.println("Loan Type : "+loantype);
        System.out.println("Decision : "+status);
        System.out.println("Maximum Loan Amount : $"+amount);
    }
}
