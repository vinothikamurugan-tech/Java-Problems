import java.util.Scanner;
public class pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passcou = 0;
        int failcou = 0;
        int max = 0;
        double totscore = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            int correctans = sc.nextInt();
            int wrongans = sc.nextInt();
            int unattempt = sc.nextInt();

            System.out.println("Student : "+name);
            System.out.println("Correct : "+correctans);
            System.out.println("Wrong : "+wrongans);
            System.out.println("Unattempted : "+unattempt);
            int score = (correctans*4)-(wrongans*3);
            System.out.println("Score : "+score);
            totscore = totscore+score;

            if(score>max){
                max = score;
            }
            String status = "";
            if(score>=32){
                status = "Pass";
                passcou++;
            }else{
                status = "Fail";
                failcou++;
            }
            System.out.println("Result : "+status);
            System.out.println();

        }

        System.out.println("Total Student : "+n);
        System.out.println("Pass Count : "+passcou);
        System.out.println("Fail Count : "+failcou);
        double avg = totscore/n;
        System.out.printf("Class Average : %.1f\n",avg);
        System.out.println("Highest Score : "+max);
        sc.close();
    }
}
