import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Seating Arrangement : ");
        for(int i = 1 ; i<=r ; i++){
            for(int j = 0 ; j<=c ; j++){
                if(j==0){
                    System.out.print("Row "+i+" : ");
                }
                if(j>0){
                    System.out.print("Seat-"+j+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Seats : "+r*c);
        sc.close();
    }
}
