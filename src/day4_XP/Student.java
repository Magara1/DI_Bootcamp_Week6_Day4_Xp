package day4_XP;

public class Student {

	private String name;
	
	private int roll_no;

	//constructor without parameters
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor with parameters
	
	public Student(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}
	
	
	//declaration getters and getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	
	//methods of the class
	
	public void displayStudent() {
		System.out.println();
	}
	
	

}
