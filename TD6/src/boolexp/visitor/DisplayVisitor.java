package boolexp.visitor;

import boolexp.And;
import boolexp.Bool;
import boolexp.Not;
import boolexp.Or;

public class DisplayVisitor implements Visitor {

	@Override
	public void visit(Bool n) {
		System.out.print(n.getValue());
	}
	
	@Override
	public void visit(Not n) {
		System.out.print("(NOT ");
		n.getOperand().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void visit(And n) {
		System.out.print("(");
		n.getLeftOperand().accept(this);
		System.out.print(" AND ");
		n.getRightOperand().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void visit(Or n) {
		System.out.print("(");
		n.getLeftOperand().accept(this);
		System.out.print(" OR ");
		n.getRightOperand().accept(this);
		System.out.print(")");
	}
	
}
