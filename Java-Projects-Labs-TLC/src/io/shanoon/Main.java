package io.shanoon;

import java.util.Random;

public class Main {
    public static int functionRandom(int number){
        Random rand = new Random();
        int numberRange = rand.nextInt();

        for(int i = 1; i < 7; i++){
            numberRange = rand.nextInt( number);
            System.out.println(i + ":" + numberRange);
        }

        return numberRange;
    }

    public static void main(String[] args) {

        functionRandom(20);
    }

}