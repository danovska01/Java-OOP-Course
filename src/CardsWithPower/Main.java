package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        int rankPower=0;
        int suitPower=0;

      CardRank [] cardRank = CardRank.values();
      for(CardRank current: cardRank){
          if(current.name().equals(rank)){
              rankPower= current.getPower();
              break;
          }
      }

      CardSuit [] cardSuits = CardSuit.values();
      for(CardSuit current: cardSuits){
          if(current.name().equals(suit)){
              suitPower=current.getPower();
          }
      }

      int power = rankPower+suitPower;


        System.out.printf("Card name: %s of %s; Card power: %d%n", CardRank.valueOf(rank), CardSuit.valueOf(suit), power);
    }
}
