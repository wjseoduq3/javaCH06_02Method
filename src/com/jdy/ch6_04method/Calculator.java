package com.jdy.ch6_04method;

public class Calculator {
	public void powerOn() {
		System.out.println("계산기를 켭니다.");
	}
	
	public double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public double substract(double x, double y) {
		double resultAdd = x - y;
		return resultAdd;
	}
	
	public double multiple(double x, double y) {
		double resultAdd = x * y;
		return resultAdd;
	}
	
	public double divide(double x, double y) {
		double resultAdd = x / y;
		return resultAdd;
	}
	
	public void powerOff() {
		System.out.println("계산기를 끕니다.");
	}
	
}
