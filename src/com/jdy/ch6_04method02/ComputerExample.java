package com.jdy.ch6_04method02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myComputer = new Computer();
		int[] values = {1, 2, 3, 4, 5, 6};
		
		int result1 = myComputer.sum1(values);
		System.out.println(result1);
		
		int result2 = myComputer.mult1(values);
		System.out.println(result2);		
	}
}
