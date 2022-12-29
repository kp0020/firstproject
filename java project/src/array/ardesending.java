package array;

public class ardesending {
public static void main(String[] args) {
		
		//int a[] = new int [10];
		int array[] = new int[] {1,9,5,7,3};
		
		//System.out.println("length of array is " + a.length);
		System.out.println("length of array is " + array.length);
		
		System.out.println("array in assending order");
	  
		//int m=0;
		for (int i=array.length-1; i>=0;i--) {
			System.out.print(array[i]);
		}
}
}
