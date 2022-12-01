package td.adaptateur;

import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Object> test = new ArrayList<Object>();
        test.add("o1");
        test.add(2);
        test.add("o3");

        Iterator<Object> it = test.iterator();

        displayNextChar(it);
    }


    public static void displayNextChar(Iterator<Object> it) {
        while(it.hasNext()) {
            Object o = it.next();
            if (o instanceof String) {
                System.out.println(o);
            }
          }
    }
}
