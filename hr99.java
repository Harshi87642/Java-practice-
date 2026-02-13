class Shape
{
  void area()
   {
     System.out.println("Calculating area");
    }
}

class square extends Shape
{
  void area()
  {
      int side = 4;
     System.out.println("(side*side");
  }
}

class hr99
{
  public static void main(String[] args)
   {
    Shape a = new square();
    a.area();
   }
}
