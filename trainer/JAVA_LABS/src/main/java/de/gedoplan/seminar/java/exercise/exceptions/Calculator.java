/*
 * Copyright (c)
 * Enterprise Java Team, GEDOPLAN GmbH
 */

package de.gedoplan.seminar.java.exercise.exceptions;

public class Calculator {

  private int operand1;
  private int operand2;
  private char operator;

  public void setOperand1(int i) {
    this.operand1 = i;
  }

  public void setOperand2(int i) {
    this.operand2 = i;
  }

  public void setOperator(char c) {
    this.operator = c;
  }

  public int evaluate() throws CalculatorException {
    switch (this.operator) {
    case '+':
      return this.operand1 + this.operand2;

    case '-':
      return this.operand1 - this.operand2;

    case 'x':
      return this.operand1 * this.operand2;

    case '/':
	  if (operand2 == 0) {
		throw new CalculatorException("Operant2 ist 0");
	  }
      return this.operand1 / this.operand2;
    }

    throw new CalculatorException("Unbekannter Operator: '" + this.operator + "'");
  }
}
