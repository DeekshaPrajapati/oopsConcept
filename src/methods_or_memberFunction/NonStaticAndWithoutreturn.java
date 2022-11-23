package methods_or_memberFunction;

/* Call non-static method without return
 * only call by object of the reference variable
 */
public class NonStaticAndWithoutreturn {

	void show() {
		int a=2;
		int b=3;
		int z = a+b;
		System.out.println("sum="+z);
	}
	
	public static void main(String args[]) {
		System.out.println("hii");
		NonStaticAndWithoutreturn non = new NonStaticAndWithoutreturn();
	    non.show();
		
	}
}
