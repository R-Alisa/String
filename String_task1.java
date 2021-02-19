package com.company;

public class String_task1 {

    public static void task1() {


        String[] strArray = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};

        int counter = 0;
        int s = counter;
        int e = counter;
        int w = counter;
        int c = counter;
        boolean te = true;


        for (String value : strArray) {
            if (value.startsWith("C")) {
                s++;
            }
        }
        System.out.println(s + " values start with C");


        for (String value : strArray) {
            if (value.endsWith("e")) {
                e++;
            }
        }
        System.out.println(e + " values ends with e");


        for (String value : strArray) {
            if (value.length() == 5) {
                w++;
            }
        }
        System.out.println(w + " values are with length 5");

        for (String value : strArray) {
            if (value.contains("e")) {
                c++;
            }
        }
        System.out.println(c + " values consist of the character “e”");

        for (String value : strArray) {
            if (value.contains("te")) {
                te = true;

            }
        }
        System.out.println("There are element which consists of the subString “te”: " + te);

        System.out.println();

    }


}
