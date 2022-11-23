package methods_or_memberFunction;

public class NonStaticWithParameterWithReturn {

	int show(int a ,int b) {
		int z=a+b;
		return z;
		
	}
	public static void main(String[] args) {
		NonStaticWithParameterWithReturn param = new NonStaticWithParameterWithReturn();
		int p = param.show( 5, 5); 
		System.out.println(p);
	}

}
