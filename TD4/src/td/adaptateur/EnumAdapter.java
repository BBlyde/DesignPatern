package td.adaptateur;

import java.util.*;

public class EnumAdapter<E> implements Iterator<E> {
    
    private Enumeration<E> e;

    public EnumAdapter(Enumeration<E> e){
        this.e = e;
    }

    @Override
    public boolean hasNext(){
        return e.hasMoreElements();
    }

    @Override
    public E next(){
        return e.nextElement();
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
