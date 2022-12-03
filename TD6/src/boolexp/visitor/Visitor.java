package boolexp.visitor;

import boolexp.And;
import boolexp.Bool;
import boolexp.Not;
import boolexp.Or;

public interface Visitor {
	
	public void visit(Bool n);
	
	public void visit(Or n);

	public void visit(And n);

	public void visit(Not n);
}
