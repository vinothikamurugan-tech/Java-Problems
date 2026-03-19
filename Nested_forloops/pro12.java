import java.util.Scanner;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            if(i%2==1){
                for(int j = 1; j<=n ; j++){
                  if(j%2==1){ 
                      System.out.print("#"+" ");
                  }else{
                      System.out.print("@"+" ");
                  }
                }
                System.out.println();
            }
            else if(i%2==0){
                for(int k = 1; k<=n ; k++){
                  if(k%2==1){
                      System.out.print("@"+" ");
                  }else{
                      System.out.print("#"+" ");
                  }
                }
                System.out.println();
            }
        } 
        sc.close();
    }
}
