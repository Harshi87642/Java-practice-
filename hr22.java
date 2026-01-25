// Fibonacci series

class hr22
{
  public static void main(String[] args)
  {
    int n = 5;
    int a = 0, b = 1;

  Sysetem.out.println("Fibonacci Series:");
    for(int i=1; i<=n; i++)
    {
      System.out.print(a+ " ");
      int c = a+b;
      a = b;
      b = c;
    }
 }
}





~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

Fibonacci Series: 0 1 1 2 3