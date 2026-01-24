//Palindrome number

class hr18
{
  public static void main(String[] args)
  {
    int num = 121;
    int temp = num;
    int reverse = 0;

   while (num != 0)
   {
     reverse = reverse * 10 + (num % 10);
      num = num / 10;
    }
    if(temp == reverse)
       System.out.println("Palindrome number");
    else
      System.out.println("Not a palindrome");
   }
}



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

Palindrome number
   