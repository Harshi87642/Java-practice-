// Count characters in a string

class hr53
{
  public static void main(String[] args)
  {
  
    String s = "Java Lab";
    int count = 0;

     for(int i=0; i<s.length(); i++)
     {
         if(s.charAt(i) != ' ')
              count++;
      }
 
   System.out.println("Characters = "+count);
   }
}






~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

OUTPUT:

Characters = 8