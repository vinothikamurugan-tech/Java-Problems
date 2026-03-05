import java.util.Scanner;
public class prob9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double annual = sc.nextDouble();
        String type = sc.next();
        double dex = sc.nextDouble();
        double taxcre = sc.nextDouble();

        double taxincome = annual-dex;
        int taxrate = 0;
        if(type.equals("C-Corp")){
            if(taxincome<500000){
                taxrate = 21;
            }else if(taxincome>=500000 && taxincome<1000000){
                taxrate = 24;
            }else if(taxincome>=1000000 && taxincome<=2000000){
                taxrate = 28;
            }else if(taxincome>2000000){
                taxrate = 30;
            }
        }
        if(type.equals("S-Corp")){
            if(taxincome<500000){
                taxrate = 20;
            }else if(taxincome>=500000 && taxincome<=1000000){
                taxrate = 25;
            }else if(taxincome>1000000){
                taxrate = 28;
            }
        }
        if(type.equals("LLC")){
            if(taxincome<200000){
                taxrate = 15;
            }else if(taxincome>=200000 && taxincome<=500000){
                taxrate = 18;
            }else if(taxincome>500000){
                taxrate = 22;
            }
        }
        if(type.equals("Partnership")){
            if(taxincome<300000){
                taxrate = 18;
            }else if(taxincome>=300000 && taxincome<=800000){
                taxrate = 22;
            }else if(taxincome>800000){
                taxrate = 26;
            }
        }

        double grosstax = taxincome*(taxrate/100.0);
        double nettax = grosstax-taxcre;
        double efrate = (nettax/annual)*100;

        System.out.println("Annual Revenue : $"+annual);
        System.out.println("Business Type : "+type);
        System.out.println("Deductible Expenses : $"+dex);
        System.out.println("Tax Credits : $"+taxcre);
        System.out.println("Taxable Income : $"+taxincome);
        System.out.println("Tax Rate : "+taxrate+"%");
        System.out.println("Gross Tax : $"+grosstax);
        System.out.println("Net Tax After Credits : $"+nettax);
        System.out.printf("Effective Tax Rate : %.2f%%",efrate);

        sc.close();
    }
}
