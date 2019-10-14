
package de.gedoplan.seminar.java.exercise.oo;

/**
 * @author Enterprise Java Team, GEDOPLAN GmbH
 */
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

  public int evaluate() {

    switch (this.operator) {
    case '+':
      return this.operand1 + this.operand2;

    case '-':
      return this.operand1 - this.operand2;

    case 'x':
      return this.operand1 * this.operand2;

    case '/':
      return this.operand1 / this.operand2;
    }

    System.err.println("Unbekannter Operator: '" + this.operator + "'");
    System.exit(1);

    return 0;
  }
}
