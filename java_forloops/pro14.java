import java.util.Scanner;
public class pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cou = 1;
        int count = 0;
        double sumfine = 0;
        for(int i = 0; i<n ; i++){
            String type = sc.next();
            int dayslate = sc.nextInt();
            if(dayslate>0){
                count++;
            }


            double dailyfine = 0;
            int finecaps = 0;
            if(type.equals("Regular")){
                dailyfine = 0.50;
                finecaps = 10;
            }else if(type.equals("Reference")){
                dailyfine = 1.00;
                finecaps = 20;
            }else if(type.equals("Magazine")){
                dailyfine = 0.25;
                finecaps = 5;
            }

            double calfine = dayslate*dailyfine;
            double min = 0;
            String capstatus = "";
            if(calfine<finecaps){
                min = calfine;
                capstatus = "No";
            }else{
                min = finecaps;
                capstatus = "Yes";
            }

            sumfine = sumfine+min;

            System.out.println("Book "+cou+" : "+type);
            cou++;
            System.out.println("Days Late : "+dayslate);
            System.out.println("Daily Fine : $"+dailyfine);
            System.out.println("Calculated Fine : $"+calfine);
            System.out.println("Actual Fine : $"+min);
            System.out.println("Cap Applied : "+capstatus);
            System.out.println();
        }
        System.out.println("Total Books : "+n);
        System.out.println("Total Fines Collected : $"+sumfine);
        System.out.println("Books Overdue : "+count);
        System.out.printf("Average Fine : $%.2f",sumfine/n);
        sc.close();
    }
}
