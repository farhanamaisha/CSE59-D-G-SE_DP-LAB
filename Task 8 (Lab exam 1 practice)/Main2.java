
import java.util.Scanner;
public class main2 {
    public static class shoppingcart{
        String[] itemname=new String[100];
        double[] price=new double[100];

        int[] quantity=new int[100];

        int count=0;
        double discount=0;
        public shoppingcart(){

        }
        public void additem(String n,double p,int q){
        itemname[count]=n;
        price[count]=p;
        quantity[count]=q;
        count++;
        }
        public void applydiscount(double percentage){
          discount=percentage;
        }
        public double getsubtotal(){
            double s=0;
            for(int i=0;i<count;i++){
                s +=price[i]*quantity[i];
            }
            return s;
        }
        public double calculatetotalwithtax(double taxrate){
           double subtotal=getsubtotal();
           subtotal=subtotal-(subtotal*discount/100);
           subtotal=subtotal+(subtotal*taxrate/100);
           return subtotal;
        }

    }
  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        shoppingcart cart=new shoppingcart();
        for(int i=0;i<2;i++){
             String item=sc.next();
             double price=sc.nextDouble();
             int quantity=sc.nextInt();
             cart.additem(item, price, quantity);
        }
        sc.next();
        double discount=sc.nextDouble();
        cart.applydiscount(discount);
        sc.next();
        double tax=sc.nextDouble();
        System.out.println(cart.getsubtotal());
        System.out.println("total after discount and tax"+ cart.calculatetotalwithtax(tax));
    }
}
