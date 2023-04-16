package JavaBasics;

public class StringConcatnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=30;
		String s="Hi";
		String h="Sneha";
		System.out.println(a+b);
		System.out.println(a+b+" "+s+" "+h);
		System.out.println(s+" "+h+" "+a+b);
		System.out.println(s+h+(a+b));
		
		String c = "Hello w3spoint";
		boolean var;
		var = c.startsWith("hello");
		System.out.println(var);
		
		int arr[] = new int [5];

		System.out.print(arr);
		
		Object[] names = new String[5];

		names[0] = new Integer(0);

	}

}
