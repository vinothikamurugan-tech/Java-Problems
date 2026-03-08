import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double peak = 0;
        int dayy = 0;
        int count = 0;
        for(int i = 0; i<n ; i++){
            int day = sc.nextInt();
            int rooms = sc.nextInt();
            int totrooms = sc.nextInt();

            double occrate = ((double)rooms/(double)totrooms)*100.0;
            sum = sum+occrate;
            if(peak<occrate){
                peak = occrate;
                dayy = day;
            }
            if(occrate==100){
                count++;
            }
            String status = "";
            if(occrate<60){
                status = "Low";
            }else if(occrate>=60 && occrate<=79){
                status = "Moderate";
            }else if(occrate>=80 && occrate<=99){
                status = "High";
            }else if(occrate>99){
                status = "Full";
            }

            System.out.println("Day : "+day);
            System.out.println("Rooms Occupied : "+rooms);
            System.out.println("Total Rooms : "+totrooms);
            System.out.println("Occupancy Rate : "+occrate+"%");
            System.out.println("Status : "+status);
            System.out.println();
        }

        System.out.println("Total Days Analyzed : "+n);
        System.out.printf("Average Occupancy Rate : %.2f%%\n",sum/n,"%");
        System.out.println("Peak Occupancy Day : Day "+dayy);
        System.out.println("Days at Full Capacity : "+count);
        sc.close();
    }
}
