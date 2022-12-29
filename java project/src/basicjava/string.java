package basicjava;

public class string {
	
	public static void main(String[] args) {
		
	String S1 = "velocity vel";
	String S2 = "velocoty";
	String S3 = new String ("velocity");
	String S4 = new String ("class");
	String S5 = new String ("velocity");
	String S6 = new String ("class");
	String S7 = "class";
	
	System.out.println(S1.equals(2));
	System.out.println(S1.equalsIgnoreCase(S2));
	System.out.println(S1.length());
	System.out.println(S1.concat(S7));
	System.out.println(S1.contains("vel"));
	System.out.println(S1.endsWith("ing"));
	System.out.println(S1.startsWith("el"));
	System.out.println(S1.charAt(4));
	System.out.println(S1.indexOf('v'));
	System.out.println(S1.indexOf('v',1));
	System.out.println(S1.isBlank());
	System.out.println(S1.isEmpty());
	System.out.println(S1.replace('c', 'z'));
	System.out.println(S1.replace("vel", "xyz"));
	System.out.println(S1.toLowerCase());
	System.out.println(S1.toUpperCase());
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
