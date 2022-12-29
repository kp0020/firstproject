package array;

public class array1 {
	
	private static int lastindex;

	public static void main(String[] args) {
		
		int a[] = {1,3,5,0};
		int c[] = new int[10];
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println("length of array is "+ a.length);
		 
			
		 
		for(int i=0; i<lastindex; i++)
		{System.out.print(a[i]);
		
		}
		
		
	int lastindex = a.length-1;
	int m=0;	
		for(int i=lastindex-1; i>=0; i--) {
			
	c[m] = a[i];
  m++; 
		}
		System.out.println("this");
	for (int i =0; i<=lastindex; i++) {
		System.out.println(c[i]);
	}
	
	
}
}