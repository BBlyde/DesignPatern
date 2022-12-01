package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import adapter.EnumerationIterator;

public class MainAdapter {

	public static void print(Iterator<Object> it) {
		Object o = null;
		while (it.hasNext()) {
			if ((o = it.next()) instanceof String) {
				System.out.println(o);
			}
		}
	}

	public static void main(String[] args) {
		List<Object> l = new LinkedList<>();
		l.add(new String("Foo"));
		l.add(new Integer(22));
		l.add(new Double(17.5));
		l.add(new String("Bar"));
		l.add(new Boolean(true));
		print(l.iterator());
		System.out.println();
		System.out.println("Adaptateur : enumération -> itérateur");
		Vector<Object> v = new Vector<>(l);
		print(new EnumerationIterator(v.elements()));
	}

}
