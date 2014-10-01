package playRoulette;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by adam on 5/16/2014 at 10:43 PM.
 */
public class Player {
    String name;
    int bankroll;
    public Hashtable<String, Integer> dictOfBets = new Hashtable<String, Integer>();

    public Player(String name, int bankroll){
        this.name = name;
        this.bankroll = bankroll;
    }

    Scanner in = new Scanner(System.in);
    public void MakeBet(){
        System.out.print("Enter the value of your bet: ");
        int value = in.nextInt();
        bankroll = bankroll - value;
        System.out.print("Enter the number you place the bet on: ");
        int location = in.nextInt();
        dictOfBets.put(String.valueOf(value), location);
    }


}
