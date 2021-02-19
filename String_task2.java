package com.company;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_task2 {

    public static void task2() {

        String text = "Climb mountains not so the world can see you, but so you can see the world";


        String[] count = text.trim().split("\\s+");
        System.out.println("Total amount of words is: " + (count.length));


        int i = 0;
        Pattern p = Pattern.compile("the");
        Matcher m = p.matcher(text);
        while (m.find()) {
            i++;
        }
        System.out.println("There are " + i + " 'the' words in string");


        int j = 0;
        Pattern a = Pattern.compile("s");
        Matcher s = a.matcher(text);
        while (s.find()) {
            j++;
        }
        System.out.println("There are " + j + " words consisting letter 's'");
//

        System.out.println("Repeating words are:");
        List<String> list = Arrays.asList(text.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String words : uniqueWords) {
            if (Collections.frequency(list, words) >1 ) {
                System.out.println(words);
            }
        }

        String replaceString = text.replace("you", "You");
        System.out.println("Original string: " + text);
        System.out.println("New string: " + replaceString);


        System.out.println();
    }


}
