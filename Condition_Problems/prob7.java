import java.util.Scanner;
public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrate = sc.nextInt();
        String bp = sc.next();
        double temp = sc.nextDouble();
        String severity = sc.next();

        String []parse = bp.split("/");
        int sys = Integer.parseInt(parse[0]);

        int stage = -1;
        if(hrate<50 || hrate>130){
            stage = 0;
        }else if(sys>180 || sys<90){
            stage = 0;
        }else if(temp>103 || temp<96){
            stage = 0;
        }else if(severity.equals("Life-Threatening")){
            stage = 0;
        }
     
        if(stage==-1){
            if((hrate>=50 && hrate<=60) || (hrate>=110 && hrate<=130)){
                stage = 1;
            }else if((sys>=160 && sys<=180) || (sys>=90 && sys<=100)){
                stage = 1;
            }else if((temp>=101 && temp<=103) || (temp>=96 && temp<=97)){
                stage = 1;
            }else if(severity.equals("Severe")){
                stage = 1;
            }
        }
        if((severity.equals("Moderate")) && (stage==-1)){
            stage = 2;
        }
        if(stage==-1){
            stage = 3;
        }

        int waittime = -1;
        if(stage==0){
            waittime = 0;
        }else if(stage==1 && severity.equals("Severe")){
            waittime = 15;
        }else if(stage==1 && severity.equals("Moderate")){
            waittime = 20;
        }else if(stage==2){
            waittime = 45;
        }else if(stage==3){
            waittime = 90;
        }

        String str = "";
        if(waittime==0){
            str = "Immediate Emergency Care";
        }else if(waittime==45){
            str = "Standard Examination";
        }else if(waittime==15){
            str = "Priority Medical Attention";
        }else if(waittime==90){
            str = "Routine Check-up";
        }else if(waittime==20){
            str = " Priority Medical Attention";
        }

        String str1 = " ";
        if(stage==0){
            str1 = "Critical";
        }else if(stage==1){
            str1 = "Urgent";
        }else if(stage==2){
            str1 = "Standard";
        }else if(stage==3){
            str1 = "Non-Urgent";
        }

        System.out.println("Heart Rate : "+hrate+" bpm");
        System.out.println("Blood Pressure : "+bp);
        System.out.println("Temperature : "+temp+"°F");
        System.out.println("Symptom Severity : "+severity);
        System.out.println("Triage Priority ; "+str1);
        System.out.println("Estimated Wait Time : "+waittime+" minutes");
        System.out.println("Recommended Action : "+str);

        sc.close();
    }
}

