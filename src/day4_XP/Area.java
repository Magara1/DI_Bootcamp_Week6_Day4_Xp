package day4_XP;

import java.util.Scanner;

public class Area {
	
	

	public static void main(String[] args) {
		
			double lenght;
		    double breadth;
	
	Scanner scanner = new Scanner(System.in);
	
	//input the value of lenght 
	
	System.out.println("Enter the value of lenght");
	lenght = scanner.nextDouble();
	
	//input the values of breadth
	System.out.println("Enter the value of breadth");
	breadth = scanner.nextDouble();
	
	
	System.out.println("the area is : " + lenght*breadth);
	
	
	

	}

}
