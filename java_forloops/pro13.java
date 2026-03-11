import java.util.Scanner;
public class pro13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double elcount = 0;
        double rejcount = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            System.out.println("Donor : "+name);
            System.out.println("Age : "+age+" years");
            System.out.println("Weight : "+weight+" kg");
            System.out.println("Hemoglobin : "+hemoglobin+" g/dL");

            String status = "";
            if((age>=18 && age<=65) && (weight>=50) && (hemoglobin>=12.5)){
                status = "Eligible";
                System.out.println("Status : "+status);
                elcount++;
            }else{
                status = "Not Eligible";
                rejcount++;
                System.out.println("Status : "+status);
                if(age<18){
                    System.out.println("Reason : Age below 18 years");
                }else if(age>65){
                    System.out.println("Reason : Age above 65 years");
                }else if(hemoglobin<12.5){
                    System.out.println("Reason : Hemoglobin below 12.5 g/dL");
                }else if(weight<50){
                    System.out.println("Reason : Weight below 50 kg");
                }
            }
            System.out.println();

        }

        System.out.println("Total Donors : "+n);
        System.out.println("Eligible Donors : "+(int)elcount);
        System.out.println("Rejected Donors : "+(int)rejcount);
        double a = (elcount/n)*100.0;
        System.out.printf("Eligibility Rate : %.1f%%",a);
        sc.close();

    }
}
