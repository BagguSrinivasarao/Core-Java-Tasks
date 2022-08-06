package task2_exception;

public class Multiple_Try_Catch_Block {
	public static void main(String[] args) {
		System.out.println("Main method starts executs");
		try {
		int a=10;
		int b=0;
		int c=a/b;
		String s = "Techouts";
		int d = Integer.parseInt(s);
	    int [] x = new int [3];
	    x[0]=5;
	    x[1]=6;
	    x[2]=8;
	    x[3]=10;
	   System.out.println(c);
		System.out.println(d);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out of Bound of Exception handled");
		}
		catch(NumberFormatException n)
		{
			System.out.println("Number formta exception handled");
		}
		
		
	}

}
