// Method to find biggest number


public class Biggest
{
  
     public int find(int a, int b)
     {
         if(a>b)
             System.out.println("a is biggest");
         else
               System.out.println("b is biggest");
       }
}


public class hr96
{
  public static void main(String[] args)
  {

      Biggest b=new Biggest();

      String str= b.find(10,20);
      System.out.println(str);
  }
}