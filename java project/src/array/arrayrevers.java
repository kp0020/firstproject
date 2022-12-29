package array;

import java.util.Arrays;

public class arrayrevers {
public static void main(String[] args) {

	int a[] = {1,3,5,0};
	int c[] = new int[10];
	System.out.println("array in ascending order");
	
	Arrays.sort(a);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	
	System.out.println("array in decending order");
	
	int lastindex = a.length -1;
	int m = 0;
	 
for (int i= lastindex; i>=0; i--) {
	
	c[m] = a[i];
	System.out.println(c[m]);
	m++;

}
System.out.println("space ");
	for (int i=0; i<=lastindex;i++) {
		System.out.println(c[i]);
	
}
  
	
  }

	
}