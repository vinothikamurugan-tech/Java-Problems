import java.util.Scanner;
public class prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = sc.nextInt();
        int year = sc.nextInt();
        String s = sc.next();
        double basesalary = sc.nextDouble();
        String status;
        int percentage = 0;
        if(rate>=3){
            status = "Eligible";
            if(s.equals("Critical")|| s.equals("critical")){
                if(rate==5 && year>5){
                    percentage = 25;
                }else if(rate==4 && year>10){
                    percentage = 22;
                }else if(rate==4){
                    percentage = 15;
                }else if(rate==3){
                    percentage = 10;
                }
            }
            if(s.equals("Non-Critical") || s.equals("non-critical") || s.equals("Non-critical")){
                if(rate==5){
                    percentage = 18;
                }else if(rate==4){
                    percentage = 12;
                }else if(rate==3){
                    percentage = 8;
                }
            }
        }else{
            status = "Not Eligible";
            percentage = 0;
        }
        double bonus = basesalary*percentage/100;
        System.out.println("Performance Rating : "+rate);
        System.out.println("Years of Service : "+year);
        System.out.println("Department : "+s);
        System.out.println("Bonus Percentage : "+percentage+"%");
        System.out.println("Bonus Amount : $"+bonus);
        System.out.println("Status : "+status);
    }
}
