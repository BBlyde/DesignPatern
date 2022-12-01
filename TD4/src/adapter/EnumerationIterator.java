package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {

	Enumeration<Object> e;

	public EnumerationIterator(Enumeration<Object> e) {
		this.e = e;
	}

	@Override
	public boolean hasNext() {
		return e.hasMoreElements();
	}

	@Override
	public Object next() {
		return e.nextElement();
	}

	// Inutile sous Java 8 : default method
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}