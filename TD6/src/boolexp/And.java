package boolexp;

import boolexp.visitor.Visitor;

public class And extends BinaryOperator {

	public And(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
