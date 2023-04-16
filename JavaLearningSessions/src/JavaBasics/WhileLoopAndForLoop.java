package JavaBasics;

public class WhileLoopAndForLoop {

	public static void main(String[] args) {
		
		
		//print the numbers from 1 to 10 using while loop
		//we should not use while loop because if we forget to give increment then it would loop infinite
		
		int i=1; // initialization
		while(i<=10)// condition
			{
			System.out.println(i);
			i++;// incremental
		}
		
  //print 1 to 10 numbers using for loop
		for(i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		// print from 10 to -10
		for(i=10;i>=-10;i--) {
			System.out.println(i);
		}
	}

}
