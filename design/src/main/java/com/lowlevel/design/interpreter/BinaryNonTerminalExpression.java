package com.lowlevel.design.interpreter;

public class BinaryNonTerminalExpression implements AbstractExpression {

	AbstractExpression leftAbstractExpression;
	AbstractExpression rightAbstractExpression;
	char operator;

	public BinaryNonTerminalExpression(AbstractExpression leftAbstractExpression,
			AbstractExpression rightAbstractExpression, char operator) {
		this.leftAbstractExpression = leftAbstractExpression;
		this.rightAbstractExpression = rightAbstractExpression;
		this.operator = operator;
	}

	@Override
	public int interpret(Context context) {
		if (operator == '+')
			return leftAbstractExpression.interpret(context) + rightAbstractExpression.interpret(context);
		else if (operator == '*')
			return leftAbstractExpression.interpret(context) * rightAbstractExpression.interpret(context);
		return 0;
	}

}
