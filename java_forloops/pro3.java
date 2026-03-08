import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int lowcount = 0;
        int critcount = 0;
        double re = 0;
        for(int i = 0; i<n ; i++){
            String product = sc.next();
            int currentstock = sc.nextInt();
            int minstock = sc.nextInt();

            String status = "";
            if(currentstock>=minstock){
                status = "Adequate";
            }else if(currentstock<minstock && currentstock>=minstock/2){
                status = "Low Stock";
            }else if(currentstock<minstock/2){
                status = "Critical";
            }

            if(status.equals("Adequate")){
               re = 0;
            }else if(status.equals("Low Stock")){
               re = (minstock-currentstock)+minstock/2;
            }else if(status.equals("Critical")){
               re = (minstock-currentstock)+minstock*1.5;
            }
            sum = sum+re;
   
            
            if(status.equals("Low Stock")){
               lowcount++;
            }else if(status.equals("Critical")){
               critcount++;
            }

            System.out.println("Product : "+product);
            System.out.println("Current Stock : "+currentstock);
            System.out.println("Minimum Stock : "+minstock);
            System.out.println("Status : "+status);
            System.out.printf("Reorder Quantity : %.0f\n",re);
            System.out.println();
        }
        
    
        System.out.println("Total Products : "+n);
        System.out.println("Low Stock Items : "+lowcount);
        System.out.println("Critical Items : "+critcount);
        System.out.printf("Total Reorder Quantity : %.0f\n",sum);
        sc.close();  
    }
}
