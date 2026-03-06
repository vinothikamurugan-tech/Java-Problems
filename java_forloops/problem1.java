import java.util.Scanner;
public class pro1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 0 ; i<n ; i++){
            String name = sc.next();
            double salary = sc.nextDouble();
            int rate = sc.nextInt();
            int increment = 0;
            if(rate==5){
                increment = 15;
            }else if(rate==4){
                increment = 10;
            }else if(rate==3){
                increment = 5;
            }else if(rate==2){
                increment = 2;
            }else if(rate==1){
                increment = 0;
            }

            double finalsal = salary*(1+increment/100.0);
            sum = sum+finalsal;

            System.out.println("Employee : "+name);
            System.out.println("Base Salary : $"+salary);
            System.out.println("Performance Rating : "+rate);
            System.out.println("Increment : "+increment+"%");
            System.out.printf("Final Salary : $%.1f\n",finalsal);
            System.out.println();
            System.out.println();
        }
        System.out.println("Total Employees Processed : "+n);
        System.out.println("Total Payroll : $"+sum);
        System.out.printf("Average Salary : $%.2f",sum/n);
        sc.close();
    }
}
