// program to demonstrate working of assignment operators

public class hr03
{
  public static void main(String[] args)  
   {
    int a= 4, b=3;
    
     System.out.println("\n The value of a is " +a + "and b is " +b);
  
     a+=b;
     System.out.println("\n The new value of a is" +a);
     
     a-=b;
          System.out.println("\n The new value of a is" +a);
     a*=b;
               System.out.println("\n The new value of a is" +a);
     a/=b;
                    System.out.println("\n The new value of a is" +a);
     
      a%=b;
                  System.out.println("\n The new value of a is" +a);
     
    }
}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

The value of a is 4and b is 3

 The new value of a is7

 The new value of a is4

 The new value of a is12

 The new value of a is4

 The new value of a is1