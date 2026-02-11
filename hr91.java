//Ecommmerce Website

public class Order
{
 
   private int order_id;
   private String customer_name;
   private String product_name;
   private float price;
   private int quantity;

   public Order(int order_id, String customer_name, String product_name, float price, int quantity)
   {
     this.order_id=order_id;
     this.customer_name=customer_name;
     this.product_name=product_name;
     this.float price=float price;
     this.int quantity=int quantity;
  }

  public double totalamount()
  {
    Total_amount=price*quantity;
     return Total_amount;
   }

  public void dispaly()
  {
    System.out.println("OID: "+order_id);
     System.out.println("Customer name: "+customer_name);
     System.out.println("Product Name: "+product_name);
     System.out.println("Price: "+price);
     System.out.println("Quantity: "+quantity);
     System.out.println("TotalPrice: "+totalamount());
  }
}



public class hr91
{
  public static void main(String[] args)
  {
    
     Order o=new Order(100,'harshi','mug',100.0,2);
      o.display();
      o.totalamount();
   }
}







````````````````````````````````````````````````````````

OUTPUT:
OID: 100
Customer name: harshi
 Product Name: mug
Price: 100.0
Quantity: 2  
TotalPrice: 200.0