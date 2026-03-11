import java.util.Scanner;
public class pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cou = 1;
        double sumkm = 0;
        double sumtotfar = 0;
        for(int i = 0; i<n ; i++){
            double km = sc.nextDouble();
            String timeofday = sc.next();

            sumkm = sumkm+km;

            System.out.println("Ride : "+cou);
            cou++;
            System.out.println("Distance : "+km+" km");
            System.out.println("Time : "+timeofday);
            double basefare = 3;
            System.out.println("Base Fare : $3.0");
            System.out.println("Distance Charge : $"+1*km);
            double timesur = 0;
            if(timeofday.equals("Evening")){
                timesur = 3;
            }else if(timeofday.equals("Night")){
                timesur = 5;
            }
            System.out.println("Time Surcharge : $"+timesur);
            double totfare = basefare+(1*km)+timesur;
            sumtotfar = sumtotfar+totfare;
            System.out.println("Total Fare : $"+totfare);
            System.out.println();
        }
        System.out.println("Total Rides : "+n);
        System.out.println("Total Distance : "+sumkm+" km");
        System.out.println("Total Revenue : $"+sumtotfar);
        double a = sumtotfar/n;
        System.out.printf("Average Fare : $%.2f",a);
        sc.close();

    }
}
