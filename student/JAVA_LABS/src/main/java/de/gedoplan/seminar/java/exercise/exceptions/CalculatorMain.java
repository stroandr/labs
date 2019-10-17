
package de.gedoplan.seminar.java.exercise.exceptions;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
public class CalculatorMain {
	public static void main(String[] args) {
		int op1 = 4;
		int op2 = 2;
		char oparator = '*'; // + - * /

		Calculator mc = new Calculator();
		mc.setOperand1(op1);
		mc.setOperand2(op2);
		mc.setOperator(oparator);

		System.out.println(mc.evaluate());

	}

}
