package com.jdy.ch6_04method;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		double resultAdd = myCalc.add(5, 6);
		System.out.println(resultAdd);
		
		double resultSubs = myCalc.substract(5, 6);
		System.out.println(resultSubs);
		
		double resultMul = myCalc.multiple(5, 6);
		System.out.println(resultMul);
		
		double resultDiv = myCalc.divide(5, 6);
		System.out.println(resultDiv);
		
		myCalc.powerOff();		
	}

}
