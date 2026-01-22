// program to demosstrate the working of switch statement
//check the working of break statement also
//check the working of without break statement also


public class hr02
{
public static void main(String[] args)
{
int a = Integer.parseInt(args[0]);

switch(a)
{
case 1: System.out.println("Sunday"); // break;
case 2: System.out.println("monday"); // break;
case 3: System.out.println("Tuesday"); // break;
case 4: System.out.println("Wednesady"); // break;
case 5: System.out.println("Thursday"); // break;
case 6: System.out.println("Friday"); // break;
case 7: System.out.println("Saturday"); // break;
default: System.out.println("invalid input.."); // break;

}
}
}