package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	@DataProvider
	public Object[][] testdata2(){
		Object data[][] = new Object[2][2];
		
		data[0][0] = "Test1";
		data[0][1] = "Test2";
		
		data[1][0] = "Test3";
		data[1][1] = "Test4";
		
		return data;
		
	}
	@DataProvider
	public Object[][] testdata1(){
		Object[][] data = new Object[3][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
		
		return data;
	}
	
	@Test(dataProvider = "testdata2")
	public void test1(String S1, String S2) {
		System.out.println("S1"+" "+S1+"S2"+" "+S2);
	}
	@Test(dataProvider = "testdata1")
	public void test2(int a, int b, int c) {
		System.out.println("a"+""+a+""+"b"+b+""+"c"+c);
	}
	
			
}
