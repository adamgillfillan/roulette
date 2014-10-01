package playRoulette;

import java.util.Scanner;

public class PlayGame{
    public static void main(String[] args) {
        Player Adam = new Player("Adam", 100);
        Scanner in = new Scanner(System.in);
        Wheel wheel = new Wheel();
        Roulette roulette = new Roulette(Adam, wheel);
        while (true){
            System.out.print("Would you like to play play Roulette? Enter y or n: ");
            String response = in.next();
            if (response.equals("y")) roulette.PlayRound();
            else {
                System.out.println("Please come again!");
                break;
            }
        }
    }
}