package playRoulette;

import java.util.Enumeration;
import java.util.Scanner;

/**
 * Created by adam on 5/16/2014 at 10:58 PM.
 */
public class Roulette {
    Player player;
    Wheel wheel;

    public Roulette(Player player, Wheel wheel)
    {
        this.player = player;
        this.wheel = wheel;
    }
    Scanner in = new Scanner(System.in);

    public void PlayRound(){
        while(true) {
            System.out.print("Would you like to make a bet? Enter y or n: ");
            String response = in.next();
            if (response.equals("n")) {
                this.wheel.spin();
                makeChanges();
                break;
            }
            else this.player.MakeBet();
        }

        System.out.println("Hello");
    }

    // Make changes to the state of the game: win or lose
    private void makeChanges() {
        System.out.println("The winning value is: " + String.valueOf(wheel.value));
        if (player.dictOfBets.contains(wheel.value)) Win();
        else Lose();
    }

    private void Win(){
        System.out.println("You win!");
        player.bankroll += 35;
        player.dictOfBets.clear();
    }

    private void Lose(){
        System.out.println("You lose!");
        player.dictOfBets.clear();
    }

    // TODO: add printing of ALL players
    private void PrintBets(){
        System.out.println(player.dictOfBets);
        Enumeration items = player.dictOfBets.keys();
        while(items.hasMoreElements())
            System.out.println(items.nextElement());
    }

    private void EndGame() {
        System.out.println("Thank you for playing.");
    }
}