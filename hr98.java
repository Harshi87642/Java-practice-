// method overriding 
class Animal
{
  void sound()
   {
     System.out.println("Animal makes sound");
    }
}

class dog extends Animal
{
  void sound()
  {
     System.out.println("Dog barks");
  }
}

class hr98
{
  public static void main(String[] args)
   {
    Animal a = new Dog();
    a.sound();
   }
}
