/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
//public class CardTrick {
// Inside CardTrick.java
public static void main(String[] args) {
    Card[] magicHand = new Card[7];
    Random rand = new Random();

    // Define the luckyCard
    Card luckyCard = new Card();
    luckyCard.setValue(7);  // Example value
    luckyCard.setSuit("Spades");  // Example suit

    // Fill the rest of the magic hand with random cards
    for (int i = 0; i < magicHand.length - 1; i++) {
        Card c = new Card();
        c.setValue(rand.nextInt(13) + 1);
        c.setSuit(Card.SUITS[rand.nextInt(4)]);
        magicHand[i] = c;
    }

    // Add the luckyCard to the hand
    magicHand[magicHand.length - 1] = luckyCard;

    // Additional logic for user interaction and card checking...
}

    
  //  public static void main(String[] args)
    //{
      //  Card[] magicHand = new Card[7];
        
        //for (int i=0; i<magicHand.length; i++)
        //{
          //  Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        //}
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
   // }
    
//}
