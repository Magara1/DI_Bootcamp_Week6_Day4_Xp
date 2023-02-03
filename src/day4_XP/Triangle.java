package day4_XP;

public class Triangle {

	//class attributes
	
	private double side1;
	
	private double side2;
	
	private double side3;

	
	//constructor without parameters
	
	public Triangle() {
		
		this.side1 = 3.0;
		this.side2 = 4.0;
		this.side3 = 5.0;
	}
	
	//constructor with parameters
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//getters and setters

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	
	//class methods
	
	public void displayTriangle() {
		System.out.println(String.format("slide 1 : %f",side2,"slide2 : %f",side2,"slide3 : %f",side3));
	}
	
	//perimeter
	
	public double perimeter() {
		
		return (side1+side2+side3);
	}
	
	//perimeter
	
	public double area() {
			
			return ((side1*side2)/2.0);
		}
		
		//display perimeter
		
	public void displayPerimeter(){
		   System.out.println(String.format("Perimeter : %f", this.perimeter()));
		    }
	   //display area
		  
    public void displayArea(){
		   System.out.println(String.format("Perimeter : %f", this.area()));
		  }
	
}
