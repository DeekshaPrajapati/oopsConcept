package methods_or_memberFunction;

/* Static method with parameter with return
 * Direct call
 * By class name call
 * by call object of the reference variable
 */
public class StaticWithParameterWithReturn {

	static String sum(String a, String b) {
		
		 
		String z= a+b;
		return z;
	}

	public static void main(String[] args) {
		
	String s1=	sum("ram","shyam"); // Direct call
	System.out.println(s1);
	
	String s2 = StaticWithParameterWithReturn.sum("ram", "abc"); // By class name call
	System.out.println(s2); 
	
	StaticWithParameterWithReturn stap = new StaticWithParameterWithReturn(); // by call object of the reference variable
	String s3 = stap.sum("a", "b");

	}

}
