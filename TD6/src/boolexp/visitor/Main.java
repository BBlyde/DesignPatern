package boolexp.visitor;

import boolexp.And;
import boolexp.Bool;
import boolexp.Node;
import boolexp.Not;
import boolexp.Or;

public class Main {

	public static void main(String[] args) {
		Node exp = new And(new Or(new Bool(true), new Bool(false)), new Not(
				new Bool(true)));
		DisplayVisitor v1 = new DisplayVisitor();
		System.out.print("Expression booléenne : ");
		exp.accept(v1);
		System.out.println();
		EvalVisitor v2 = new EvalVisitor();
		exp.accept(v2);
		System.out.println("Valeur de l'expression : " + v2.getValue());
	}

}
