import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<=i ; j++){
                if(j==0 || j==i){
                    c = 1;
                    System.out.print(c+" ");
                }else{
                    c = c*(i-j+1)/j;
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
        sc.close(); 
    }
}
