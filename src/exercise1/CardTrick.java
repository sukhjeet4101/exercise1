package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); // Values from 1 to 10
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from 0 to 3
            hand[i] = card;
        }

        // Ask the user for a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-10): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Clubs, 4-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]); // Adjusting for 0-based array

        // Search for the user's card in the hand
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        }
    }

    // A simple method to print out personal information
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is sukhjeet singh, but you can call me prof, sukh ");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("become singer");
        System.out.println("buy g wagon");

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("singing");
        

        System.out.println();
    }
}
