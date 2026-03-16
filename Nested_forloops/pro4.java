import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int sub = sc.nextInt();
        System.out.println("Grade Sheet:");
        System.out.print("Student ");
        for(int i = 1; i<=sub ;i++){
            System.out.print("Sub"+i+" ");
        } 
        System.out.print("Average\n");
        double sum = 0.0;
        for(int i = 1; i<=student ; i++){
            String name = sc.next();
            System.out.print(name+" ");
            for(int j = 1 ; j<=sub ; j++){
                int mark = sc.nextInt();
                System.out.print(mark+" ");
                sum = sum+mark;
            }
            double avg = sum/sub;
            System.out.printf("%.2f\n",avg);
            sum = 0.0;
        }
        sc.close();
    }
}
