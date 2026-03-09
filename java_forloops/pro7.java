import java.util.Scanner;
public class pro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumunit = 0;
        double totrev = 0;
        for(int i = 0; i<n ; i++){
            String cusID = sc.next();
            int unit = sc.nextInt();
            sumunit = sumunit+unit;
            double bill = 0;
            if(unit>=0 && unit<=100){
                bill = unit*0.10;
            }else if(unit>=101 && unit<=200){
                bill = (100*0.10)+(unit-100)*0.13;
            }else if(unit>=201 && unit<=300){
                bill = (100*0.10)+(100*0.13)+(unit-200)*0.16;
            }else if(unit>300){
                bill = (100*0.10)+(100*0.13)+(100*0.16)+(unit-300)*0.20;
            }

            totrev = totrev+bill;

            String category = "";
            if(unit<=200){
                category = "Low Usage";
            }else if(unit>=201 && unit<=300){
                category = "Medium Usage";
            }else if(unit>300){
                category = "High Usage";
            }

            System.out.println("Consumer ID : "+cusID);
            System.out.println("Units Consumed : "+unit);
            System.out.println("Bill Amount : "+bill);
            System.out.println("Category : "+category);
            System.out.println();

        }
        System.out.println("Total Consumers : "+n);
        System.out.println("Total Units Consumed : "+sumunit);
        System.out.println("Total Revenue : $"+totrev);
        System.out.printf("Average Bill : $%.2f",totrev/n);
        sc.close();
    }
}
