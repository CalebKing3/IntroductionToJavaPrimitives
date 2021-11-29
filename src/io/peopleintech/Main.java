package io.peopleintech;

public class Main {

    public static void main(String[] args) {
        // ? Welcome to Introduction with Java Primitives

        /*
         * Overview
         * The Java Programming Language features eight primitive data types.
         * In this article, we'll recall what primitives are and go over them.
         **/

        // ? int - Java stores it using 32 bits of memory.
        int x = 150;
        int y;

        // ? byte - is primitive data type similar to int, except it only takes up 8 bits of memory
        byte b = 100;
        byte empty;

        // ? At 16 bits of memory, it's half the size of int and twice the size of byte.
        short shorty = 10_10;
        short shortStuff;

        // ? long is the big brother of int. It's stored in 64 bits of memory.
        long l = 1_234_567_890;
        long reallyLong;

        // ? This type is stored in 32 bits of memory just like int. However, because of the
        // ? floating decimal point its range is much different. It can represent both positive and negative numbers
        float f = 3.145f;
        float anotherFloat;

        // ? It's stored in 64 bits of memory. Which means it represents a much larger range
        // ? of possible numbers than float.
        double d = 3.13457599923384753929348D;
        double doubleAgain;

        // ? boolean is the cornerstone of controlling our programs flow.
        boolean isMarried = true;
        boolean isItBig;

        // ? char is a 16-bit integer representing a Unicode-encoded character.
        // ? Its range is from 0 to 65,535. Which in Unicode represents ‘\u0000' to ‘\uffff'.
        char aLetter = 'a';
        char anotherLetter = 65;
        char oneMoreLetter;

    }
}
