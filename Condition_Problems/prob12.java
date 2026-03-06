import java.util.Scanner;
public class prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String type = sc.next();
        String drirec = sc.next();
        String level = sc.next();
        
        double baseprem = 0;
        if(level.equals("Basic")){
            baseprem = 500;
        }else if(level.equals("Standard")){
            baseprem = 800;
        }else if(level.equals("Comprehensive")){
            baseprem = 1500;
        }

        double agefact = 0;
        if(age>=16 && age<=21){
            agefact = 1.8;
        }else if(age>=22 && age<=25){
            agefact = 1.5;
        }else if(age>=26 && age<=40){
            agefact = 1.0;
        }else if(age>=41 && age<=60){
            agefact = 0.9;
        }else if(age>=61){
            agefact = 1.1;
        }

        double vrf = 0;
        if(type.equals("Sedan")){
            vrf = 1.0;
        }else if(type.equals("SUV")){
            vrf = 1.2;
        }else if(type.equals("Sports")){
            vrf = 1.5;
        }else if(type.equals("Truck")){
            vrf = 1.1;
        }

        int readj = 0;
        if(drirec.equals("Clean")){
            readj = -10;
        }else if(drirec.equals("Minor-Violations")){
            readj = 25;
        }else if(drirec.equals("Major-Violations")){
            readj = 50;
        }

        double adjprem = baseprem*agefact*vrf;
        double finalprem = adjprem*(1+readj/100.0);
        double monthprem = finalprem/12;

        String risk = "";
        if((type.equals("Sports")) || (agefact>=1.8)){
            risk = "Very High";
        }else if(drirec.equals("Major-Violations")){
            risk = "High";
        }else if(drirec.equals("Minor-Violations")){
            risk = "Medium";
        }else{
            risk = "Low";
        }

        System.out.println("Driver Age : "+age);
        System.out.println("Vehicle Type : "+type);
        System.out.println("Driving Record : "+drirec);
        System.out.println("Coverage Level : "+level);
        System.out.println("Base Premium : $"+baseprem);
        System.out.println("Age Factor : "+agefact+"x");
        System.out.println("Vehicle Risk Factor : "+vrf+"x");
        System.out.println("Record Adjustment : "+readj+"%");
        System.out.printf("Monthly Premium : $%.2f\n",monthprem);
        System.out.printf("Annual Premium : $%.2f\n",finalprem);
        System.out.println("Risk Category : "+risk);

        sc.close();
    }
}
