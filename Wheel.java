package playRoulette;

import java.util.Random;

/**
 * Created by adam on 5/16/2014 at 11:04 PM.
 */
public class Wheel {
    int value;

    public Wheel(){}

    public void spin() {
        Random rand = new Random();
        this.value = rand.nextInt(36);
    }
}