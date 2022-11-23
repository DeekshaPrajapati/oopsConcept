package methods_or_memberFunction;

/* static method calling
 * direct
 * by class name
 * by object reference variable
 * 
 */
public class StaticWithoutReturn {
	
	static void show() {
		int a;
		System.out.println("a");
	}

	public static void main(String[] args) {
		System.out.println("hii");
		show();  //// Direct calling 
		StaticWithoutReturn.show(); // calling by class name
		StaticWithoutReturn sta = new StaticWithoutReturn();
			sta.show(); // calling by object of the reference variable
		

	}

}
