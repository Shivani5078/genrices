package comapny;

import java.util.Scanner;
//creat a class
public class UC2 { 
	
	//declare the method 
	public Float MaxFloat (Float  firstValue, Float  secondValue, Float  thirdValue) {
		Float  maxFloat  = firstValue;
		if (secondValue.compareTo(maxFloat ) > 0)
			maxFloat  = secondValue;
		if (thirdValue.compareTo(maxFloat ) > 0)
			maxFloat  = thirdValue;
		System.out.println("The Maximum value is :"+maxFloat );
		return maxFloat;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to program");
		   MainClass obj = new MainClass();
		
		
         Scanner sc =new Scanner(System.in); //get input form user
         System.out.println("Enter first Value");
         Float  a = sc.nextFloat();
         System.out.println("Enter second Value");
         Float  b = sc.nextFloat();
         System.out.println("Enter third Value");
         Float  c = sc.nextFloat();
         
         //calling method
 		 obj.MaxFloat(a,b,c);

	}
}
