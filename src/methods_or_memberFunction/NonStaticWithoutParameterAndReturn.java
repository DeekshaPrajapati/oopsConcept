package methods_or_memberFunction;

/*
 * Non-static method without parameter with return
 * only call by object of the reference variable
 */

public class NonStaticWithoutParameterAndReturn {

	boolean show() {
		int a=2, b=2;
		if(a==b) {
			return true;
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		NonStaticWithoutParameterAndReturn retu = new  NonStaticWithoutParameterAndReturn();
	    boolean p = retu.show();
	    System.out.println(p);

	}

}
