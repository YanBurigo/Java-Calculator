package br.com.jws.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double subtration(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double multiplication(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double division(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double mean(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	public Double squareRoot(Double number) {
		return Math.sqrt(number);
	}
}
