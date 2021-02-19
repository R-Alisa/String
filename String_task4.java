package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class String_task4 {

    enum Suit{
        Spades, Clubs, Hearts, Diamonds;
    }

    enum Rank{ two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace;
    }


    public static void task4() {




      String deck[][]=new String[4][13];

        for(Suit suit:Suit.values())
           for(Rank rank:Rank.values())
               deck[suit.ordinal()][rank.ordinal()]= rank.name()+ " of " + suit.name();

            for (int i=0; i< deck.length;i++){
                for(int j=0;j<deck[i].length;j++)
                    System.out.println(deck[i][j]+ "");
                System.out.println("-----");

            }


    }
}
