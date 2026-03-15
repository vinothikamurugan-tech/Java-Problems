import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Price Comparison Matrix : ");
        System.out.print("Product ");
        for(int i = 1 ; i<=c ; i++){
            System.out.print("Vendor"+i+" ");
        }
        System.out.println("BestPrice");
        for(int i = 1; i<=r ; i++){
            String name = sc.next();
            System.out.print(name+" ");
            double min = 0;
            for(int j = 1; j<=c ; j++){
                double price = sc.nextDouble();
                System.out.print(price+" ");
                if(j==1){
                    min = price;
                }else if(min>price){
                    min = price;
                }
            }
            System.out.print(min+"\n");
        }
        sc.close();
    }
}
