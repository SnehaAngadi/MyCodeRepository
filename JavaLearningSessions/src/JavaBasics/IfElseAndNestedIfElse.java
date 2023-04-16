package JavaBasics;

public class IfElseAndNestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // comparison operators are >,<,>=,<=,!=
		
		int a=10;
		int b=80;
		int c=500;
		
		/*if(a>b) {
		System.out.println("a is greater than b");
		}else {
			
			System.out.println("b is greater");
			
		}*/
		
		if(a>b & a>c) {
			System.out.println("a is greater ");
			}
		else if(b>c) {
				
			System.out.println("b is greater");
				
			} 
		else {
				System.out.println("c is greater");
			}
		
		}

}
