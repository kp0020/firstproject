package array;

public class arrayproblm {
	
	public static void main(String[] args) {
		
		//int a[] = new int [10];
		int array[] = new int[] {1,9,5,7,3};
		
		//System.out.println("length of array is " + a.length);
		System.out.println("length of array is " + array.length);
		
		System.out.println("array in assending order");
	  
		int m=0;
		for (int i=0; i<array.length; i++) {
		for (int j=i+1; j<array.length; j++) {
			if (array[j]<array[i]) {
				m=array [i];
				array[i]=array[j];
				array[j]= m;
			
			}
		
		}
			System.out.println(array[i]);
		}
		
	
		
		}
	
	
		
	
		
		
		
	}


