import java.util.Scanner;

class Check
{ 
  public static void main(String args[])
  {
    Scanner obj = new Scanner(System.in);
	
	int length = obj.nextInt(); 
	int breadth = obj.nextInt();
	
	if(length==breadth)
	{
    System.out.println("Is square");

    }
	 else
	       System.out.println("Is not square");
 
	  }
}