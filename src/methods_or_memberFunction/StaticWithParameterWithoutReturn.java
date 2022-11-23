package methods_or_memberFunction;

/* static method with parameter but no return statement
 * direct call
 * by class name call
 * by call reference variable of the object
 */

public class StaticWithParameterWithoutReturn {
	
	static void show(String a, String b) {
		
		 
		String z= a+b;
		System.out.println(z);
	}

	public static void main(String[] args) {
		show("ram","shyam"); // direct call
		StaticWithParameterWithoutReturn .show("ram","shyam"); // by class name call
		StaticWithParameterWithoutReturn param = new StaticWithParameterWithoutReturn();
		param.show("ram","shyam"); // by call reference variable of the object
		

	}

}
