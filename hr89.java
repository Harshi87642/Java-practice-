// simple calculator
public class Calculator
{
     private int num1=30;
     private int num2=20;

     public int add()
     {
         int result= num1+num2;
          return result;
      }
     public int sub()
     {
         int result= num1-num2;
          return result;
      }
       public int mul()
     {
         int result= num1*num2;
          return result;
      }
       public int div()
     {
         int result= num1/num2;
          return result;
      }

}

public class hr89
{
  public static void main(String[] args)
  {
 
    Calculator calc = new  Calculator();

    System.out.println("Addition: "+ calc.add());
      System.out.println("Subtraction: "+ calc.sub());
      System.out.println("Multiplication: "+ calc.mul());
      System.out.println("Division: "+ calc.div());

     
   }
}







````````````````````````````````````````````````````````````````````````````````

OUTPUT:

Addition: 50
Subtraction: 10
Multiplication: 600
Division: 1
