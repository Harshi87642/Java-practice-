// Gertters and Setters
// Relational Database:  data is stored in rwos and columns
public class Student
{
       private String name;
       private int id;


       public String toString()
       {
           return "Student[name="+name+", id="+id+""]";
       }

       public String getName()
       {
           return name;
       }

       public void setName(String name)
       {
       if(name.length()>8)
       {
         this.name=name;
       }
       else
       {
       System.out.println("minimum length should be greater than 8");
       }
       }

       public int getId()
       {
       return id;
        }

        public void setId(int id)
        {
        this.id=id;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        }

}


public class hr92
{
    public static void main(String[] args)
    {
       Student s=new Student();

       s.setId(12);
       s.setName("harshitha");
       System.out.println(s);

    }
 }