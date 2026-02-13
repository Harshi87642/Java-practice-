class Vehicle
{
  void speed()
   {
     System.out.println("vehicle speed");
    }
}

class car extends Vehicle
{
  void speed()
  {
     System.out.println("car speed is 120kmph");
  }
}

class hr101
{
  public static void main(String[] args)
   {
    Vehicle b = new car();
    b.speed();
   }
}
