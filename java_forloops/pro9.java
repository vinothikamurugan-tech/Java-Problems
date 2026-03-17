import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int session = 1;
        int totaldu = 0;
        int totalcalo = 0;
        for(int i = 0; i<n ; i++){
            String type = sc.next();
            int duration = sc.nextInt();
            totaldu = totaldu+duration;
            int calories = 0;
            String intensity = "";
            if(type.equals("Running")){
                calories = 10*duration;
                intensity = "High";
            }else if(type.equals("Swimming")){
                calories = 12*duration;
                intensity = "High";
            }else if(type.equals("Cycling")){
                calories = 8*duration;
                intensity = "Moderate";
            }else if(type.equals("Gym")){
                calories = 7*duration;
                intensity = "Moderate";
            }else if(type.equals("Walking")){
                calories = 4*duration;
                intensity = "Low"; 
            }

            totalcalo = totalcalo+calories;

            System.out.println("Session "+session+" : "+type);
            System.out.println("Duration : "+duration+" minutes");
            System.out.println("Calories Burned : "+calories);
            System.out.println("Intensity : "+intensity);
            System.out.println();
            session++;
        }

        System.out.println("Total Workouts : "+n);
        System.out.println("Total Duration : "+totaldu+" minutes");
        System.out.println("Total Calories Burned : "+totalcalo);
        System.out.println("Average Calories per Session : "+totalcalo/n);
        if(totalcalo<300){
            System.out.println("Fitness Level : Beginner");
        }else if(totalcalo>=300 && totalcalo<=1000){
            System.out.println("Fitness Level : Intermediate");
        }else if(totalcalo>1000){
            System.out.println("Fitness Level : Advanced");
        }
        sc.close();
    }
}
