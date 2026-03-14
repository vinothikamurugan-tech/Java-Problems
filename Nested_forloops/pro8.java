import java.util.Scanner;
public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Attendencs Matrix : ");
        System.out.print("Student ");
        for(int i = 1; i<=c ; i++){
            System.out.print("Day"+i+" ");
        }
        System.out.print("Attendance%\n");
        int max = 0;
        for(int i = 1 ; i<=r ; i++){
            String name = sc.next();
            double count = 0;
            System.out.print(name+" "); 
            for(int j = 1; j<=c ; j++){
                char ch = sc.next().charAt(0);
                System.out.print(ch+" ");
                if(ch=='P'){
                    count++;
                }
            }
            double per = (count/c)*100.0;
            if(per==100){
                max++;
            }
            System.out.printf("%.2f%%\n",per);
        }
        System.out.println();
        System.out.println("Perfect Attendance : "+max+" students");
        sc.close();
    }
}
