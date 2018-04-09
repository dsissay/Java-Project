
public class MyException extends Exception {
	
	String str1;
	String str2;
	

	public MyException (String str2) {
		str1=str2;
	}
	
	public String toString() {
		return ("my Exception"+str1);
	}
	
	public static void main (String [] args)
	{
		
		
		try {
			System.out.println("Starting of Try");
			throw new MyException("This is an error");
			
		} catch (MyException exp) {
			System.out.println("Starting of Try");
			
		//	System.out.println(exp);
		}
	}

}
