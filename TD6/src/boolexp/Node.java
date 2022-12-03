package boolexp;

import boolexp.visitor.Visitor;

public interface Node {

	public void accept(Visitor v);

}
