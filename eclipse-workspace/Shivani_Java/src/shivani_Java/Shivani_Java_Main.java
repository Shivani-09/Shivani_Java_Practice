package shivani_Java;

import java.util.Scanner;


//import methodOverridingDog.trixy;

public class Shivani_Java_Main
{

	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
////		birdSound bs = new birdSound();
//		
//		Sparrow p = new Sparrow(); // polymorphism hw
//		p.sing(1);				  // polymorphism hw
		
		//----------------------------------------------------------
//		
//// method overloading hw
//		
//		
//		MyClass c = new MyClass();
//		int result2 = c.addNum(4, 5);  // method overloading hw
//		System.out.println(result2);
//		
//		MyClass d = new MyClass();		// method overloading hw
//		double result3 = d.addNum(2.3,3.4,4.5);
//		System.out.println(result3);		
//	
//		MyClass m = new MyClass();		// method overloading hw
//		m.addNum();
//	
//
//		
//		System.out.println("Please enter source: ");	// method overloading hw
//		String source = sc.nextLine();
//		System.out.println("Please enter destination: ");	// method overloading hw
//		String destination = sc.nextLine();
//		
//		bookTicket bt =  new bookTicket(source, destination);	// method overloading hw
//		
//		
//		bt.displayInfo(); // Inheritance acquired here ? or only when extends word is used?
//		bt.confirmBooking(); // Inheritance acquired here
//		
		
		//----------------------------------------------------------
//// method overriding hw
//		
//		
//		trixy x = new trixy();
//		x.dog();
//		System.out.println(x.getAvgSize());
//		
		
		
		//----------------------------------------------------------
//	
		//Asceding Descending order of user entered input.
		
//		AscDsc asds = new AscDsc();
//		
//		 int digitCount;
//		 
//		 System.out.print("Enter an integer: ");
//		 
//		 int number = sc.nextInt()	;
//		 digitCount =0;
//		 int tempNum = number;
////		 number = tempNum; 
//		 if(tempNum ==0 || tempNum<=9) {
//			 System.out.println("It's a single number. It's neither ascending or descending!");
//		 }
//		 
//		 if (tempNum == 0) {
//			 digitCount =1;
//		 } else { 
//			 int n= tempNum;
//			 while (n > 0) {
//				 n/=10;
//				 digitCount ++;	
//			 }
//		 }
//		 if (digitCount == 0) { // Should not happen for positive numbers unless input was 0
//	            System.out.println("No digits to check.");
//	            return;
//	        }
//
//		 int[] digit = new int[digitCount];
//		 for (int i=0; i< digitCount; i++) {
//			 digit[i] = tempNum % 10;
//			 tempNum /= 10;
//		 }
//		 System.out.println("Extracted digits: ");
//		 asds.printArray(digit);
//		 
//		 boolean isAscendingOrder = asds.isAscending(digit);
//		 boolean isDescendingOrder = asds.isDescending(digit);
//		 
//		 System.out.println("\nThe number " + number + " (digits: )");
//	        if (isAscendingOrder && isDescendingOrder) {
//	            System.out.println("Its digits are in both ascending and descending order (e.g., all digits are same).");
//	        } else if (isAscendingOrder) {
//	            System.out.println("Its digits are in ascending order.");
//	        } else if (isDescendingOrder) {
//	            System.out.println("Its digits are in descending order.");
//	        } else {
//	            System.out.println("Its digits are in neither ascending nor descending order.");
//	        }
//	    }
//		 
//	
		//----------------------------------------------------------
	//	
			
		
		
//		Shivani_Java_Class sjc = new Shivani_Java_Class(5);
//		
//		System.out.println("Enter a number: ");
//		sjc.addingFirst(2, sc.nextInt());
//		
//		sjc.printArray();
//		
		
		
	}
	
}
