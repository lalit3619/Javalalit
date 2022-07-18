package com.OOPSPrograms;

public class Chrome extends Demo1  {
Chrome(int a) {
	super(a);
}
	@Override
	void launch() {
		System.out.println("Chrome launched");
		
	}

	@Override
	void close() {
		System.out.println("Chrome close");
		
	}

}
