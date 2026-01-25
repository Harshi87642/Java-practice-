// Count Number of Digits
class hr21.java
{
 public static void main(String[] args)
  {
    int num = 45678;
    int count = 0;
 

   while(num != 0)
   {
     count++;
     num = num / 10;
   }

 System.out.println("Number of digits =" +count);
  }
}



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

Number of digits = 5
