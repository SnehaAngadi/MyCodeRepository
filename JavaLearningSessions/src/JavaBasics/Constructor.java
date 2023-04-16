package JavaBasics;

public class Constructor {
	
	public Constructor() {
		this(4,9,7);
		System.out.println("Default constructor");
	}
	
	public Constructor(int a,int b) {
		this();
		System.out.println("Two parameter constructot");
	}
	
	public Constructor(int a , int b, int c) {
		
		System.out.println("Three parameter constructor");
	}
	
    public Constructor(int a ) {
	    this(2,3,4,6);
		System.out.println("One parameter constructor");
	}
	public Constructor(int a , int b, int c, int d) {
		
		System.out.println("Four parameter constructor");
	}

	public static void main(String[] args) {
		
		
		Constructor obj=new Constructor(34,60);
		Constructor obj1=new Constructor(6);
		}

}
