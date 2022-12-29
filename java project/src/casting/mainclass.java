package casting;

public class mainclass {
	public static void main(String[] args) {
		
		class1 obj1 = new class2();
		obj1.m1();  // up casting
		obj1.m2();
		
		class2 obj2 =(class2) new class1();
		
		obj2.m1();  // down casting does not support 
		obj2.m2();
		obj2.m3();
		
	}

}
