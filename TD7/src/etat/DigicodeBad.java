package etat;

import java.util.Scanner;

public class DigicodeBad {

    private int digicodeState = 0;

    public void appuyer(String key){
        switch (digicodeState) {
            case 0:
                if (key.equals("a")) {
                    digicodeState = 1;
                } else {
                    digicodeState = -1;
                }
                break;

            case 1:
                if (key.equals("b")) {
                    digicodeState = 2;
                } else {
                    digicodeState = -1;
                }
                break;

            case 2:
                if (key.equals("c")) {
                    digicodeState = 3;
                    System.out.println("Door is unlocked");
                } else {
                    digicodeState = -1;
                }
                break;
        
            default:
                break;
        }
    }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        DigicodeBad d1 = new DigicodeBad();

        for (int i = 0; i < 4; i++) {
            if(d1.digicodeState != 3){
                System.out.println("Please choose a, b, c or d");
                d1.appuyer(sc.next());
            }
        }

        if (d1.digicodeState == -1) {
            System.out.println("Wrong password");
        }
    }
}
