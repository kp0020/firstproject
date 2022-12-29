package basicjava;

public class ReverseString {

	
	
	public static void main(String[] args) {
		
	String str = "velocity is my class";
	 String a[] = str.split(" ");
		
	//for (int i=str.length()-1; i>=0; i--) {
			
		
		//System.out.print(str.charAt(i));
		//str2 = str2+str.charAt(i);System.out.println(str2);
	for (int i= a.length-1; i>=0;i--) {
		System.out.println(a[i]);
	}
			
			
			
	}
	
}


