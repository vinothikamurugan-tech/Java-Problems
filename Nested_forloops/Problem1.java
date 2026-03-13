import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int num = 0;
        for(int i = 1; i<=r+1 ; i++){
            for(int j = 0; j<=c ; j++){
                if(i==1){
                    for(int k = 1 ; k<=c ; k++){
                        System.out.print(k+" ");
                    }
                    break;
                }else if(j==0){
                    System.out.print(num+" ");
                }else{
                    System.out.print(j*num+" ");
                }
            }
            num++;
            System.out.println();
        }
        sc.close();
    }
}
