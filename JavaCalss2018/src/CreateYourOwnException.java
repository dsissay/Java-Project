
public class CreateYourOwnException extends Exception {
	
	String str1;
	String str2;
	
	
	public String toString() {
		return ("my Exception" +str1);
	}
	
	public String myException() {
		return
	}
	
	public static void main (String [] args)
	{
		Eligebility(17,58);
		
		try {
			System.out.println("Starting of Try");
			throw new MyException("This is an error");
			
		} catch (myException exp) {
			System.out.println("Starting of Try");
			throw new MyException(exp);
			
		}
	}
	
	static void Eligebility(int a, int b) {
		
	
	if (a<1 || b<0) {
		throw new ArithmeticException("Eligeble");
	}
	else {
		System.out.println("Not Eligeble");
	}

}
	
	

	
}