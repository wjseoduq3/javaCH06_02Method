package com.jdy.ch6_04method02;

public class Computer {
	public int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public int mult1(int[] values) {
		int mult = 1;
		for (int i = 0; i < values.length; i++) {
			mult *= values[i];
		}
		return mult;
	}
}
