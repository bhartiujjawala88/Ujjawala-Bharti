package Twohrjava;
import java.util.Arrays;

public  class Man
{
	public static void main (String[] args)
	{
	 String name="UJJAWALA BHARTI";
	 double age =30;
	 double marks =80;
	 float pie = 3.14f;
	 boolean eligible = true;
	 double div=marks/age;
	 String friend =name;
	 
	 
	 System.out.println("Hello world");  	// 1st program.
	 System.out.println(friend);       // value assign(2).
	 System.out.println(div);            // data type entry(3).
	 System.out.println(name.length());     // string length(4).
	 System.out.println((int)pie);       // convertion of float into int datatype(5).
	 System.out.println(eligible);   // boolean data type(6).
	 
// use of string
	 
	 String address="PATNA";
	 String addition=name +" from "+ address;
	 
	 System.out.println(addition);
	 
// use of charAt 
	 
	 System.out.println(name.charAt(1));
	 
// letter replacement
	 
//	char oldChar;
	//char newChar;
//	String name2 = name.replace( oldChar: "U", newChar: "P");
   //  System.out.println(name2); 
	  //IN JAVA STRINGS ARE IMMUTABLE.
	
// Substring
	 
	 System.out.println(addition.substring(0,16));
	 System.out.println(addition.substring(16,21));
	 
//  ARRAYS
	 
	  int[] marks1 =new int[5];
	  marks1[0]= 90;
	  marks1[1]= 95;
	  marks1[2]= 92;
	  marks1[3]= 94;
	  marks1[4]= 96;
	  System.out.println(marks1[4]);
	  System.out.println(marks1[1]);
	  System.out.println(marks1.length);
	  
//ARRAYS SORT	  
	Arrays.sort(marks1);
	System.out.println(marks1[1]);
	 
	int[] mark = {20,28,9,34,8,18};
	System.out.println(mark[1]);
	
	int[][] passMark = {{90,95,93,90,91},{38,9,19,89,12}};
	System.out.println(passMark[1][2]);
	
// 	Implicit Casting
	
	double Price= 100.00;
	double finalPrice= Price + 18.18;
	System.out.println(finalPrice);
	
//  Explicit Casting 
	
	int p = 100; double q = p + 0.18 ;
	int m = p + (int)18.8; 
	System.out.println(m);
	 
	System.out.println(q);

// final keyword
	
	final float  Pie =3.14F;
	System.out.println(Pie);
	 float Pie2 = Pie + 2;
	 System.out.println(Pie2);
	 
	
	 
	 

	}
}