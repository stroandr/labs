
package de.gedoplan.seminar.java.exercise.exceptions;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class Calculator {
	private int operand1;
	private int operand2;
	private char operator;

	public void setOperand1(int i) {
		operand1 = i;

	}
 
	public void setOperand2(int i) {
		operand2 = i;

	}

	public void setOperator(char c) {
		operator = c;
	}

	public int evaluate() {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			try {
				int i = operand1 / operand2;
				return i;

			} catch (ArithmeticException e) {
				System.out.println("Division durch 0 " + e);
			}

		}
		return 0;

	}
}
