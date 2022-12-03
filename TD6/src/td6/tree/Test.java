package td6.tree;

import java.util.Iterator;
import tree.iterator.*;

/*Tree:
           1
        __2 3__
     __4__     5
    6     7   8 9
     10 11 12    
*/
public class Test {
    public static void main(String[] args) {
        Tree<Integer> lllr = new Tree<>(10);
        Tree<Integer> lll = new Tree<>(6, null, lllr);
        Tree<Integer> llrl = new Tree<>(11);
        Tree<Integer> llrr = new Tree<>(12);
        Tree<Integer> llr = new Tree(7, llrl, llrr);
        Tree<Integer> ll = new Tree<>(4, lll, llr);
        Tree<Integer> l = new Tree<>(2, ll, null);
        Tree<Integer> rrl = new Tree<>(8);
        Tree<Integer> rrr = new Tree<>(9);
        Tree<Integer> rr = new Tree<>(5, rrl, rrr);
        Tree<Integer> r = new Tree<>(3, null, rr);
        Tree<Integer> root = new Tree(1, l, r);
        Iterator<Integer> it = root.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}