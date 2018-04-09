
public class Teacher2 extends Teacher1{

	
	public static void main (String[] args)
	{
		Teacher2 th=new Teacher2();
		
		String dep="IT";
		th.setSalary(1000);
		th.setAdres("Gojam");
		
		 System.out.println(th.getAdres());
		 System.out.println(th.getSalary());
		 System.out.println(dep);
	}
}
