package boolexp;

import boolexp.visitor.Visitor;

public class Not extends UnaryOperator {

	public Not(Node operand) {
		super(operand);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
