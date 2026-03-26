import java.util.Scanner;
public class prob8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String location = sc.next();
        int sq = sc.nextInt();
        int age = sc.nextInt();
        int score = sc.nextInt();
        double baseprice = 0;

        if(location.equals("Prime")){
            baseprice = 400;
        }else if(location.equals("Urban")){
            baseprice = 300;
        }else if(location.equals("Suburban")){
            baseprice = 180;
        }else if(location.equals("Rural")){
            baseprice = 100;
        }

        int per = 0;
        if(age>=0 && age<=5){
            per = 0;
        }else if(age>=6 && age<=10){
            per = -5;
        }else if(age>=11 && age<=15){
            per = -10;
        }else if(age>=16 && age<=25){
            per = -15;
        }else if(age>=26 && age<=30){
            per = -20;
        }else if(age>=31){ 
            per = -25;
        }

        double basevalue = sq*baseprice;

        double ambonus = 0;
        if(score>=80 && score<=100){
            double a = basevalue*(10/100);
            ambonus = a+basevalue;
        }else if(score>=60 && score<=79){
            double b = basevalue*(5/100);
            ambonus = b+basevalue;
        }else if(score>=40 && score<=59){
            double c = basevalue*(2/100);
            ambonus = c+basevalue;
        }else if(score<40){
            ambonus = basevalue;
        }

        double adjvalue = basevalue*1*(per/100.0);
        double fina = adjvalue+ambonus;

        String category = "";
        if(((location.equals("Prime")) || (location.equals("Urban"))) && (age<=15)){
            category = "Hot";
        }else if(location.equals("Suburban")){
            category = "Stable";
        }else if((location.equals("Rural")) || (age>30)){
            category = "Slow";
        }

        System.out.println("Location Tier : "+location);
        System.out.println("Square Footage : "+sq+"sq ft");
        System.out.println("Property Age : "+age+"years");
        System.out.println("Amenity Score : "+score);
        System.out.println("Base Price Per Sq Ft : $"+baseprice);
        System.out.println("Age Adjustment : "+per+"%");
        System.out.println("Amenity Bonus : $"+ambonus);
        System.out.println("Estimated Property Value : $"+fina);
        System.out.println("Market Category : "+category);

        sc.close();
    }
}
