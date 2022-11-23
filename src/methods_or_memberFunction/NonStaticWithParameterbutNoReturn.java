package methods_or_memberFunction;

/* non-static method with parameter but no return
 * only call by object of the reference variable
 * 
 */
public class NonStaticWithParameterbutNoReturn {

	
	void show(int x,int y) {
		int z= x+y;
		System.out.println("Add"+z);
	}
	
	public static void main(String[] args) {
		NonStaticWithParameterbutNoReturn param =new NonStaticWithParameterbutNoReturn();
		param.show( 23, 45);
			
	}

}
