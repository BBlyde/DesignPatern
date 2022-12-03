package boolexp;

import boolexp.visitor.Visitor;

public class Or extends BinaryOperator {

	public Or(Node leftOperand, Node rightOperand) {
		super(leftOperand, rightOperand);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
