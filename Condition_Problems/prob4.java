import java.util.Scanner;
public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tier = sc.next();
        double cart = sc.nextDouble();
        String category = sc.next();
        String member = sc.next();
        int basedis = 0;
        if((tier.equals("Bronze")) || (tier.equals("bronze"))){
            basedis = 5; 
        }else if((tier.equals("Silver")) || (tier.equals("silver"))){
            basedis = 8;
        }else if((tier.equals("Gold")) || (tier.equals("gold"))){
            basedis = 12;
        }else if((tier.equals("Platinum")) || (tier.equals("platinum"))){
            basedis = 15;
        }

        int adddis1 = 0;
        int adddis = 0;
        if(cart>=500 && cart<=999){
            adddis1 = 3;
        }else if(cart>=1000 && cart<=1999){
            adddis1 = 5;
        }else if(cart>=2000){
            adddis1 = 7;
        }

        if((category.equals("Electronics")) || (category.equals("electronics")) && (member.equals("Prime"))){
            adddis = adddis1+5;
        }else if((category.equals("Fashion")) || (category.equals("fashine"))){
            adddis = adddis1+3;
        }else if((category.equals("Books")) || (category.equals("books")) && (member.equals("Prime"))){
            adddis = adddis1+5;
        }else if((category.equals("Groceries")) || (category.equals("groceriess")) && (cart>300)){
            adddis = adddis1+2;
        }

        int totdis = basedis + adddis;
        double finprice1 = 1-(totdis/100.0);
        double finprice = cart*finprice1;
        double savings = cart-finprice;

        System.out.println("Loyalty Tier : "+tier);
        System.out.println("Cart Value : $"+cart);
        System.out.println("Product Category : "+category);
        System.out.println("Membership : "+member);
        System.out.println("Base Discount : "+basedis+"%");
        System.out.println("Additional Discount : "+adddis+"%");
        System.out.println("Total Discount : "+totdis+"%");
        System.out.println("Final Price : $"+finprice);
        System.out.println("Savings : $"+savings);
    }
}
