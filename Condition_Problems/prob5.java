import java.util.Scanner;
public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int score = sc.nextInt();
        String type = sc.next();
        String status;
        if(gpa>=2.5){
            status = "Eligible";
        }else{
            status = "Not Eligible";
        }

        String range = "None";
        double amount = 0 ;
        if((type.equals("Merit")) || (type.equals("merit"))){
            if(gpa>=3.8 && score>=80){
                range = "Full";
                amount = 25000;
            }else if(gpa>=3.5 && score>=70){
                range = "Partial";
                amount = 15000;
            }else if(gpa>=3.0 && score>=60){
                range = "Minimal";
                amount = 8000;
            }
        }
        if((type.equals("Need-Based")) || (type.equals("need-based"))){
            if(income<=30000 && gpa>=3.5){
                range = "Full";
                amount = 30000;
            }else if(income<=50000 && gpa>=3.0){
                range = "Partial";
                amount = 18000;
            }else if(income<=70000 && gpa>=2.8){
                range = "Minimal";
                amount = 10000;
            }
        }
        if((type.equals("Sports")) || (type.equals("sports"))){
            if(score>=85 && gpa>=3.0){
                range = "Full";
                amount = 22000;
            }else if(score>=75 && gpa>=2.8){
                range = "Partial";
                amount = 20000;
            }else if(score>=65 && gpa>=2.5){
                range = "Minimal";
                amount = 12000;
            }
        }

        System.out.println("GPA : "+gpa);
        System.out.println("Family Income : $"+income);
        System.out.println("Extracurricular Score : "+score);
        System.out.println("Scholarship Type : "+type);
        System.out.println("Eligibility : "+status);
        System.out.println("Award Amount : $"+amount);
        System.out.println("Award Category : "+range);
        sc.close();
    }
}
