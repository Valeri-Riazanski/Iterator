package com.val.riazanski;

import static java.lang.Math.random;

public class IterTest {
    public static void main(String[] args) {
        final int valueAlphabet = 26;
        final int shift = 97;
        final int n = 10;
        String[] strings = new String[n];
        char firstChar;
        char secondChar;
        System.out.println("создали массив из строк");
        for (int i = 0; i < n; i++) {
            firstChar = (char) ((int) (shift + valueAlphabet * random()));
            secondChar = (char) ((int) (shift + valueAlphabet * random()));
            strings[i] = "" + firstChar + secondChar;
            System.out.println(i + " " + strings[i]);
        }
        StringArray stringArray = new StringArray(strings);
        ArrayIterator iter = stringArray.createIterator();
        System.out.println("пройдем по нашему массиву с помощью вновь созданного итератора");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
