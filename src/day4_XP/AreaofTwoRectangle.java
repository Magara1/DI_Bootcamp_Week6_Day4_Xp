package day4_XP;

public class AreaofTwoRectangle {

	//class attributes
	
	private double lenght;
	
	private double breadth;
	
	
	//constructor without parameter

	public AreaofTwoRectangle() {
		super();
	}

	//constructor with parameter

	public AreaofTwoRectangle(double lenght, double breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}

	//getter and setter

	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	//the methods 
	
	private double area(){
		
		return (lenght*breadth);
		
	}
	
	public void displayArea() {
		 lenght = (double)Math.round(lenght*100)/100;
         System.out.println(String.format("Lenght: %f Breadth: %f Area: %f",lenght,breadth, this.area()));
	}
	
	
	
	
	
	
	
}
