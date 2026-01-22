
//program to demonstrate to the working of relational and logical operators



public class hr04
{
public static void main(String[] args)
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);


if((a>0) && (b> 0))
System.out.println("Either or both are negative");
}
}

output

java hr04 10 4
Either or both are negative

C:\hr>java hr04 2 9
Either or both are negative
