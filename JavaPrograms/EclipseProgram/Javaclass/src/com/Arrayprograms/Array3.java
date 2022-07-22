package com.Arrayprograms;

public class Array3 {

	public static void main(String[] args) {
		int [] ar= {2,4,22,14,29,23,24,55,32,21,26,33};
		int bigger=-0;
		for (int a:ar)
		{
			if(a>bigger)
			{
				bigger=a;
			}
		}
System.out.println("Bigger Elements "+bigger);
	}

}
