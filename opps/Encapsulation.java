
class product{
    private String productID;
    private String productName;
    private double Price;
    private int stock;

    public void getAllInfo(){
        System.out.println("product id: " + this.productID);
        System.out.println("product name: " + this.productName);
        System.out.println("price: " + this.Price);
        System.out.println("stokc: " + this.stock);
    }

    public void setProductID(String id){
        this.productID = id;
    }

    public void setProductName(String name){
        this.productName = name;
    }



    public void setPrice(double amount){
        if(amount>0){
            this.Price = amount;  
        }
        else{
            System.out.println("invalid ammount");

        }
        
    }
 
    public void setStock(int stk){
        if(stk>=0){
          this.stock = stk;
        }
        else{
            System.out.println("invalid stock");
        }
    }

    public void restStock(int quantity){
        if(quantity>0){
             this.stock += quantity;
        }
        else{
            System.out.println("inavlid number");

        }
    }

    public int sell(int quantity){
        return this.stock-=quantity;
    }

    public void discount(double disc){
        if(disc>0 && disc<100){
           this.Price = this.Price*(1 - disc / 100.0); 
        }
        else{
            System.out.println("invalid disc");
        }
    }

}


public class Encapsulation {
    public static void main(String args[]){
      
        product laptop = new product();

        laptop.setProductID("P101");
        laptop.setProductName("Gaming laptop");
        laptop.setPrice(1200.0);
        laptop.restStock(10);

        laptop.sell(3);
        laptop.discount(10);
        laptop.sell(7);

        laptop.getAllInfo();
   
   
    }
}
