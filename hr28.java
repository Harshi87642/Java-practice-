// Check Armstrong Number
class hr28
{ 
   public static void main(String[] args)
   {
     int num = 153, temp = num;
     int sum = 0;
    
      while(temp!=0)
      {
         int d = temp % 10;
         sum = sum + (d*d*d);
         temp = temp/10;
      }
     if(sum == num)
        System.out.println("Armstrong number");
     else
        System.out.println("Not an Armstrong number");
   }
}





~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

Armstrong number
