package parameterargument;

public class ParamArg {

	public int square(int n) {
		return n * n;
	}
	
	public static void main(String[] args) {
		
		ParamArg p = new ParamArg();
		p.square(2);

	}

}
