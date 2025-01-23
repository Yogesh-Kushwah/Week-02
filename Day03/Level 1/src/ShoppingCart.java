
 class Product{

    static int discount;
       String productName;
    int price;
    int quantity;

     final int productID;

     public Product(String productName, int price, int quantity,int productID,int discount) {
         this.productName = productName;
         this.price = price;
         this.quantity = quantity;
         this.productID = productID;
         Product.discount=discount;
     }

     static void updateDiscount(){
       if(discount==10){
           discount +=10;

           System.out.println("The Discount you will receive is "+discount);
           return;

    }
         System.out.println("The discount you will receive is: "+discount);


     }
     void display(){

         System.out.println(" ProductId "+productID+" Name "+productName+" Price "+price+" Quantity "+quantity);
     }
 }



public class ShoppingCart {
    public static void main(String[] args) {

        Product product= new Product("Mickey mouse",200,5,1,10);

        if(product instanceof Product){
            product.display();

        }
        Product.updateDiscount();


    }
}
