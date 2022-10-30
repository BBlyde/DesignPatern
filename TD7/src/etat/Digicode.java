package etat;

import java.util.Scanner;

public class Digicode {
    private DigicodeState state = new State0();

    public void setState(DigicodeState s){
        state = s;
    }

    public void appuyer(String c){
        state.appuyer(this, c);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Digicode d1 = new Digicode();

        for (int i = 0; i < 4; i++) {
            System.out.println("Please choose a, b, c or d");
            d1.appuyer(sc.next());
        }
        if (d1.state instanceof State4) {
            System.out.println("Door is unlocked");
        } else {
            System.out.println("Door is locked");
        }
    }
}
