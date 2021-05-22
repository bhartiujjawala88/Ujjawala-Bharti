import java.util.Scanner;
class Prise
{
 public static void main( String args[])
 {
  Scanner obj= new Scanner(System.in);
  System.out.println("Number of  products needed for coustmer");
  int n= obj.nextInt();
  int C = 100;
   int p= n*C;
  
  if(n>1000)
  {
   p= p-p/10;
   System.out.println("Actual price=total - discount=$"+p);
   
   }
   else
   {
    System.out.println("total price=$"+p);
	}
	}
	}
	   
	   
