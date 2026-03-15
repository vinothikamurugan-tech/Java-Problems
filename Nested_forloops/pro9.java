import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                if(j==i){
                    for(int k = i ; k>=1 ; k--){
                        System.out.print(k);
                    }
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
