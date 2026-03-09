import java.util.Scanner;
public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double finetot = 0;
        double orgtot = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            count = count+quantity;
            int dis = 0;
            if(quantity==1){
                dis = 0;
            }else if(quantity>=2 && quantity<=4){
                dis = 10;
            }else if(quantity>=5 && quantity<=9){
                dis = 15;
            }else if(quantity>=10){
                dis = 20;
            }

            double subtot = price*quantity*(1-dis/100.0);
            finetot = finetot+subtot;

            orgtot = orgtot+(price*quantity);

            System.out.println("Product : "+name);
            System.out.println("Unit Price : $"+price);
            System.out.println("Quantity : "+quantity);
            System.out.println("Discount : "+dis+"%");
            System.out.printf("Subtotal : $%.2f\n",subtot);
            System.out.println();
        }
        System.out.println("Total Items : "+count);
        System.out.println("Original Total : $"+orgtot);
        double a = orgtot-finetot;
        System.out.println("Total Discount : $"+a);
        System.out.println("Final Total : $"+finetot);
        double saving = (a/orgtot)*100.0;
        System.out.printf("Savings : %.2f%%",saving);
        sc.close();
    }
}
