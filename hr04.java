// program to study increment and decrement operators.

public class hr04
{
  public static void main(String[] args)
  {
   int a=4;
    System.out.println("\n The new value of a is " +(a));       //4
     System.out.println("\n The new value of a is " +(++a));     //5
     System.out.println("\n The new value of a is " +(a));       //5
    System.out.println("\n The new value of a is " +(a++));     // 5,6
    System.out.println("\n The new value of a is " +(a));       //6

    
    
    System.out.println("\n The new value of a is " +(a));       //6
     System.out.println("\n The new value of a is " +(--a));     //5
     System.out.println("\n The new value of a is " +(a));       //5
    System.out.println("\n The new value of a is " +(a--));     // 5,4
    System.out.println("\n The new value of a is " +(a));       //4

    
    }
}
    
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

 The new value of a is 4

 The new value of a is 5

 The new value of a is 5

 The new value of a is 5

 The new value of a is 6

 The new value of a is 6

 The new value of a is 5

 The new value of a is 5

 The new value of a is 5

 The new value of a is 4