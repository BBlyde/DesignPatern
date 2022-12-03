package td6.tree.iterator;

import java.util.Iterator;
import td6.tree.Tree;

public class PreOrder<V> implements Iterator<V>{
    private Tree<V> tree;

    public PreOrder(Tree<V> tree){
        this.tree = tree;
    }

    @Override
    public boolean hasNext() {
        Tree<V> tmp = tree;
        while(tmp.getParent() != null) {
            tmp = tmp.getParent();
        }
        while(tmp.getRight() != null) {
            tmp = tmp.getRight();
        }
        return (tree != tmp);
    }

    /*Tree:
           1
        __2 3__
     __4__     5
    6     7   8 9
     10 11 12    
*/
    @Override
    public V next() {
        //On va au fils gauche jusqu'au plus bas possible, si il n'a pas de fils gauche (alors c'est une feuille)
        if (tree.getLeft() != null) {
            tree = tree.getLeft();
        }    
        //On va au fils droit jusqu'au plus bas possible, si il n'a pas de fils gauche (alors c'est une feuille)
        else if (tree.getRight() != null) {
            tree = tree.getRight();
        }
        //On vérifie le voisin, si la racine du sous arbre est un fils gauche alors on va à droite
        else if (tree.getParent().getLeft() == tree){
            tree = tree.getParent().getRight();
        } else{
            //On remonte tant qu'on se trouve à droite, une fois à gauche on change le prochain comme celui à droite
            System.out.println("on remonte");
            while (tree.getParent() != null && tree.getParent().getRight() == tree) {
                System.out.println(tree.getValue() + " " + tree.getParent().getValue() + "oui");
                tree = tree.getParent();
                System.out.println(tree.getParent().getRight().getValue());
            }
            tree = tree.getParent().getRight();
        }
         
        return tree.getValue();
    }
    
}
