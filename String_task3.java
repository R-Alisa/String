package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_task3 {

    public static void task3() {

        String name = "John";

        Pattern namepattern = Pattern.compile("[A-Z][a-z]");
        Matcher namematcher = namepattern.matcher(name);
        boolean namematchFound = namematcher.find();
        if (namematchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        String surname = "s20surname";
        Pattern surnamepattern = Pattern.compile("[a-z]{1}[0-9]{2}[a-z]");
        Matcher surnamematcher = surnamepattern.matcher(surname);
        boolean surnamematchFound = surnamematcher.find();
        if (surnamematchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        String personCodeOfLatvian = "121200-11311";
        Pattern codepattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
        Matcher codematcher = codepattern.matcher(personCodeOfLatvian);
        boolean codematchFound = codematcher.find();
        if (codematchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        System.out.println();
    }


}
