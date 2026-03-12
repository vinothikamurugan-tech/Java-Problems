import java.util.Scanner;
public class pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int minsave = 0;
        int maxsave = 0;
        double tempsum = 0;
        int hot = 0;
        int cold = 0;
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            int hour = sc.nextInt();
            double temp = sc.nextDouble();

            tempsum = tempsum+temp;
            if(i==0){
                min = temp;
                max = temp;
                minsave = hour;
                maxsave = hour;
            }else if(min>temp){
                min = temp;
                minsave = hour;
            }else if(max<temp){
                max = temp;
                maxsave = hour;
            }

            if(temp>=32){
                hot++;
            }else if(temp<=10){
                cold++;
            }

            System.out.println("Hour "+hour+" : "+temp+"°C");
            if(temp>40 || temp<0){
                System.out.println("Status : Extreme");
            }else if(temp>=32 && temp<=40){
                System.out.println("Status : Hot");
            }else if(temp>=0 && temp<10){
                System.out.println("Status : Cold");
            }else if(temp>=10 && temp<=32){
                System.out.println("Status : Normal");
            }
            System.out.println();
        }

        System.out.println("Total Readings : "+n);
        double a = tempsum/n;
        System.out.printf("Average Temperature : %.2f°C\n",a);
        System.out.println("Highest Temperature : "+max+"°C at Hour "+maxsave);
        System.out.println("Lowest Temperature : "+min+"°C at Hour "+minsave);
        System.out.println("Hot Hours : "+hot);
        System.out.println("Cold Hours : "+cold);
        sc.close();
    }
}
