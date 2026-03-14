import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int start = sc.nextInt();
        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int num = 1;
        for(int i = start ; i<=7 ; i++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        int count = 0;
        for(int i = num ; i<=date ; i++){
            count++;
            System.out.print(i+" ");
            if(count%7==0){
                System.out.println();
            }
        }
        sc.close();
    }
}
