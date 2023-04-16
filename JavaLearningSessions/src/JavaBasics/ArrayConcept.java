package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// one dimensional array
		//there can be integer,double,char,string and boolean array
		//this is static in nature, size will not vary- to overcome this we use collection-arraylist,hashtable etc
		//this is consists of only similar type of data- to over come this we use Object array
		//lower bound/index=0
		//upper bound/index=n-1 where n is size
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		System.out.println(i[4]);
		System.out.println(i.length);// size of array
		
		//System.out.println(i[5]);//  this will error in ArrayIndex out of Bound exception because we are trying to access array which is more than size
		//print all array items
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
			
		}
		
		//Object array to store different data types
		Object ob[]=new Object[5];
		ob[0]="Tom";
		ob[1]='d';
		ob[2]=2;
		ob[3]=44.9;
		ob[4]="2/4/2000";
		System.out.println(ob[4]);
		for(int c=0;c<ob.length;c++) {
			System.out.println(ob[c]);
		}
		

	}

}
