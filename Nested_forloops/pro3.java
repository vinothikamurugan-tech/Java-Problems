import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        String ch = sc.next();
        for(int i = 1 ; i<=r ; i++){
            for(int j = 1; j<=i ; j++){
                if(ch.equals("star")){
                    System.out.print("*");
                }else if(ch.equals("number")){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
