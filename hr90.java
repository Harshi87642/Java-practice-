// Constructor

public  class Calculator
{
   
    private int num1;
    private int num2;

     public Calculator(int num1, int num2)
      {
         this.num1=num1;
         this.num2=num2;
       }
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

public class hr90
{
  public static void main(String[] args)
  {
 
    Calculator calc = new  Calculator(30,20);

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


