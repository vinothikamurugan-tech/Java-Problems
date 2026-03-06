import java.util.Scanner;
public class prob13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String status = sc.next();
        int hours = sc.nextInt();
        String protype = sc.next();
        String residency = sc.next();

        double tuition = 0;
        if(protype.equals("Undergraduate")){
            tuition = 350;
        }else if(protype.equals("Graduate")){
            tuition = 550;
        }else if(protype.equals("Professional")){
            tuition = 800;
        }

        double resmul = 0;
        if(residency.equals("In-State")){
            resmul = 1.0;
        }else if(residency.equals("Out-of-State")){
            resmul = 2.5;
        }else if(residency.equals("International")){
            resmul = 3.0;
        }

        double fee = 0;
        if(status.equals("Full-Time")){
            if(protype.equals("Undergraduate")){
                fee = 500;
            }else if(protype.equals("Graduate")){
                fee = 750;
            }else if(protype.equals("Professional")){
                fee = 1200;
            }
        }
        if(status.equals("Part-Time")){
            if(protype.equals("Undergraduate")){
                fee = 300;
            }else if(protype.equals("Graduate")){
                fee = 750;
            }else if(protype.equals("Professional")){
                fee = 900;
            }
        }
        if(status.equals("Continuing-Education")){
            fee = 150;
        }

        double actfee = 0;
        if(status.equals("Full-Time")){
            actfee = 200;
        }else if(status.equals("Part-Time")){
            actfee = 100;
        }else if(status.equals("Continuing-Education")){
            actfee = 50;
        }

        double tuitioncost = hours*tuition*resmul;
        double totalfee = tuitioncost+fee+actfee;

        String category = "";
        if((status.equals("Full-Time")) || (residency.equals("In-State"))){
            category = "Standard";
        }else if(status.equals("Continuing-Education")){
            category = "Reduced";
        }else if((residency.equals("International")) || (residency.equals("Out-of-State"))){
            category = "Premium";
        }

        System.out.println("Student Status : "+status);
        System.out.println("Credit Hours : "+hours);
        System.out.println("Program Type : "+protype);
        System.out.println("Residency : "+residency);
        System.out.println("Base Tuition Per Credit : $"+tuition);
        System.out.println("Residency Multiplier : "+resmul+"x");
        System.out.println("Program Fee : $"+fee);
        System.out.println("Student Activity Fee : $"+actfee);
        System.out.println("Total Registration Fee : $"+totalfee);
        System.out.println("Fee Category : "+category);
        sc.close();
    }
}
