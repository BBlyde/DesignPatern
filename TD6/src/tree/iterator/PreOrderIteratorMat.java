package tree.iterator;

import java.util.Iterator;
import tree.Tree;

public class PreOrderIteratorMat<V> implements Iterator<V> {
	private Tree<V> t, current, next;
	private boolean hasLooped;

	public PreOrderIteratorMat(Tree<V> tree) {
		t = tree;
		current = tree;
		next = current;
		hasLooped = false;
	}

	@Override
	public boolean hasNext() {
		return !hasLooped;
	}

	@Override
	public V next() {
		current = next;
		if (next.getLeft() != null) //Case 1: you can still go to the left
			next = next.getLeft();
		else if (next.getRight() != null) //Case 2: you can't go to the left, but you can go to the right
			next = next.getRight();
		else { //Last case: you need to go back up to an intersection (case 2)
			while (next != t && next != next.getParent().getLeft()) //Go back up to latest time tree went left, you might reach the end
				next = next.getParent();
			if (next != t) {
				next = next.getParent();
				while (next.getRight() == null && next != t) //Go back up to next branch to the right, you might also reach the end
					next = next.getParent();
				if (next.getRight() != null)
					next = next.getRight();
			}
		}
		if (next == t)
			hasLooped = true;
		return current.getValue();
	}
}
