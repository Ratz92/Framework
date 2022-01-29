package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeout {


	@Test(invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
	public void infiniteloopTest() {
		int i =1;
		while(i==1) {
			System.out.println(i);
		}
		
	}
	
}
