package exceptionProgram;

public class ArithmaticOperation1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		//Try Catch block
		int div;
		try 
		{
        div=a/b;//terminate the program 
		}catch(ArithmeticException e) {
			div=a/2;
		}
		System.out.println("div="+div);
		
	}

}