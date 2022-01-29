package com.testng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void sum() {
		int a = 1, b = 20, c = 20;
		System.out.println("Sum is " + c);
		}
	
	
	
	
	
	
	
}
