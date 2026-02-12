// Method to print factorial

public class Factorial
{
  public int fact(int n)
   {
       int f=1;
        for(int i=1; i<=n; i++)
         {
            f=f*i;
          }
         return f;
    }
}

public class hr97
{
  public static void main(String[] args)
   {
      Factorial f = new Factorial();
       f.fact(5);
   }
}
 
       