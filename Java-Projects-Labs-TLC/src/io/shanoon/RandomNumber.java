package io.shanoon;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class RandomNumber {



    public static void main(String[] args) {
        //yields a random double number in the range zero (0.0) to one (1.0)
            // (excluding the upper limit of exactly 1.0).


        //--1
        double randomNumber = Math.random();
        System.out.println("Random number : "+randomNumber);

        // You can convert this to an integer in the range 1 to randomRange value 10:
        // --2
        double randomRange = (int)(Math.random()*10)+1;
        System.out.println("Random range of 1 to 10: "+randomRange);

        //check out ThreadLocalRandom.current().nextInt()
        // --3

        ThreadLocalRandom rangeNumber =  ThreadLocalRandom.current();
            int rangeRand =    rangeNumber.nextInt(10);
        System.out.println("range Number: " + rangeRand);

        //java.util.Random.nextInt()
        //--4

        Random rangeIntegerRandom = new Random();
        System.out.println("Integer Numbers: "+ rangeIntegerRandom.nextInt(10));

        //Generate a random integer in the range 0 to 100, and print a message to say whether it is odd or even.
        //--5

        int EvenOdd = rangeIntegerRandom.nextInt(100);

        if (EvenOdd % 2 == 0){
            System.out.println(EvenOdd + " even");
        }
        else {
            System.out.println(EvenOdd +  " odd");
        }

        //Modify your program to categorize the integer according to the following scale:
        //--6
        //0        frozen
        //1-14    cold
        //15-24    cool
        //25-40    warm
        //41-60    hot
        //61-80    very hot
        //81-99    extremely hot
        //100        boiling

        int temp = rangeIntegerRandom.nextInt(100);

        if (temp == 0){
            System.out.println(temp +" is Frozen");
        }
        else if (temp >= 1 && temp <= 14){
            System.out.println(temp +" is Cold");
        }
        else if (temp >= 15 && temp <= 24){
            System.out.println(temp +" is Cool");
        }
        else if (temp >= 25 && temp <= 40){
            System.out.println(temp +" is Warm");
        }
        else if (temp >= 41 && temp <= 60){
            System.out.println(temp +" is Hot");
        }

        else if (temp >= 61 && temp <= 80){
            System.out.println(temp +" is Very Hot");
        }
        else if (temp >= 81 && temp <= 99){
            System.out.println(temp +" isExtremely Hot");
        }
        else {
            System.out.println(temp +" is Boiling");
        }

        //Generate a random number in the range 0-9, and for each one print out its text name (e.g. one, two, etc.)
        // --7.

        int textNumber = rangeIntegerRandom.nextInt(9);
        switch (textNumber){
            case 0:
                System.out.println(textNumber + " Zero");
                break;
            case 1:
                System.out.println(textNumber + " One");
                break;
            case 2:
                System.out.println(textNumber + " Two");
                break;
            case 3:
                System.out.println(textNumber + " Three");
                break;
            case 4:
                System.out.println(textNumber + " Four");
                break;
            case 5:
                System.out.println(textNumber + " Five");
                break;
            case 6:
                System.out.println(textNumber + " Six");
                break;
            case 7:
                System.out.println(textNumber + " Seven");
                break;
            case 8:
                System.out.println(textNumber + " Eight");
                break;
            case 9:
                System.out.println(textNumber + " Nine");
                break;
            default:
                System.out.println("Not available");
        }
        //Generate random numbers in the range -3 to +3 and stop when the value is zero. Use a
        //do/while
        // loop
        // --8.

        int threes =   rangeNumber.nextInt(-3,3);
        do {
            System.out.println("Three :" + threes);
            threes ++;
        } while (threes == 0);

//        int count = 1;
//        do {
//            System.out.println("Count is: " + count);
//            count++;
//        } while (count < 11);

        //multiplication tables for the numbers 1 to 10.
        // --9

        for(int change = 1; change < 11; change++){
            for(int mult = 1; mult < 13; mult++ ){
                int result = mult * change;
                System.out.println( change + "*" + mult + "=" + result );
            }
        }
        //print out 6 numbers in the range 1 to 49
        //--10
        Random rand = new Random();
        for (int i = 1; i < 7; i++){
            int Number = rand.nextInt(49);
            System.out.println("Number "+ i + " is : "+Number);
        }
        //--11
        functionRandom(49);
    }
    public static int functionRandom(int number){
        Random rand = new Random();
        int numberRange = rand.nextInt();

        for(int i = 1; i < 7; i++){
            numberRange = rand.nextInt( number);
            System.out.println(i + ":" + numberRange);
        }

        return numberRange;
    }
}
