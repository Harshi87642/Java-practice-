class Bank
{
  void interest()
   {
     System.out.println("Bank interest rate");
    }
}

class SBI extends Bank
{
  void interest()
  {
     System.out.println("SBI interest is 7%");
  }
}

class hr100
{
  public static void main(String[] args)
   {
    Bank b = new SBI();
    b.interest();
   }
}
