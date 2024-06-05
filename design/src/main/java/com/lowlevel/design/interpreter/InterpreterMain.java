package com.lowlevel.design.interpreter;

public class InterpreterMain {

	public static void main(String[] args) {

		Context context = new Context();

		context.putContextValue("A", 2);
		context.putContextValue("B", 4);
		context.putContextValue("C", 6);
		context.putContextValue("D", 5);

		AbstractExpression abstractExpression = new BinaryNonTerminalExpression(
				new BinaryNonTerminalExpression(new NumberTerminalExpression("A"), new NumberTerminalExpression("B"),
						'*'),
				new BinaryNonTerminalExpression(new NumberTerminalExpression("C"), new NumberTerminalExpression("D"),
						'*'),
				'+');

		System.out.println(abstractExpression.interpret(context));
	}

}
