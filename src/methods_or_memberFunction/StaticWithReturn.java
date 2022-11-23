package methods_or_memberFunction;

/* static method with return statement
 * direct call
 * by class name call
 * call by object of the reference variable
 */
public class StaticWithReturn {
	
   static String show() {
    	String a= "ram";
    	
		return a;
    	
    }

	public static void main(String[] args) {
		
    String s = show(); // direct call
     System.out.println(s);
     
     String s1 =StaticWithReturn.show(); // by class name call
     System.out.println(s);
     
     StaticWithReturn sta = new StaticWithReturn(); // call by object of the reference variable
     String s2 =sta.show();
     System.out.println(s2);
	}

}
