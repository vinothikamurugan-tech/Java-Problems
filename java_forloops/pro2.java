import java.util.Scanner;
public class pro2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int max = 0;
        int passcou = 0;
        int failcou = 0;
        for(int i = 0; i<n ; i++){
            String name = sc.next();
            int score = sc.nextInt();
            String grade = "";
            if(score>=85 && score<=100){
                grade = "A";
            }else if(score>=70 && score<=84){
                grade = "B";
            }else if(score>=60 && score<=69){
                grade = "C";
            }else if(score>=50 && score<=59){
                grade = "D";
            }else if(score>=0 && score<=49){
                grade = "F";
            }
            

            if(i==0){
                max = score;
            }else{
                if(max<score){
                    max = score;
                }
            }
            sum = sum+score;
            String status ="";
            if(score>=60){
                status = "Pass";
            }else if(score<60){
                status = "Fail";
            }

            if(status.equals("Pass")){
                passcou++;
            }else if(status.equals("Fail")){
                failcou++;
            }

            System.out.println("Student : "+name);
            System.out.println("Score : "+score);
            System.out.println("Letter Grade : "+grade);
            System.out.println("Status : "+status);
            System.out.println();
        }
        System.out.println("Total Students : "+n);
        System.out.println("Class Average : "+sum/n);
        System.out.println("Highest Score : "+max);
        System.out.println("Students Passed : "+passcou);
        System.out.println("Students Failed : "+failcou);

        sc.close();
    }
}