
public class MyownException2 extends Exception {
	
	static int a=10;
	static int b=20;
	
	public MyownException2 (int a) {
		a=5;
	}
	
	public MyownException2(boolean c) {
		// TODO Auto-generated constructor stub
	}

	public int  Tryit () {
		return b;
	}
	public static void main (String [] args)
	{
		
		
		try {
			System.out.println(b);
			throw new MyownException2 (a>b);
			
		} catch (MyownException2 exp) {
			System.out.println(a);
			
		//	System.out.println(exp);
		}

}
}