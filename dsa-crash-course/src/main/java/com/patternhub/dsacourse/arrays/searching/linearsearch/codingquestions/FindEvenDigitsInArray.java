package com.patternhub.dsacourse.arrays.searching.linearsearch.codingquestions;

/**
 * @author ravikant_kondepati
 */
public class FindEvenDigitsInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,444,5,666,5,4432,3,45,55,-234565};
        System.out.println(findEvenDigits1(numbers));
        System.out.println(findEvenDigits2(numbers));
    }
    static int findEvenDigits1(int[] numbers){
        int count = 0;
        for (int number: numbers){
            if(number < 0){
                number = number * -1;
            }
            String s = String.valueOf(number);
            if(s.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int findEvenDigits2(int[] numbers){
        int count = 0;
        for (int number: numbers){
            int digits = findDigits(number);
            if(isEven(digits)){
                count++;
            }
        }
        return count;
    }

    static int findDigits(int number){
        if(number < 0){
            number = number * -1;
        }
        int count = 0;
        while(number > 0){
            number = number/10;
            count++;
        }
        return count;
    }

    static boolean isEven(int number){
        return number % 2== 0;
    }
}
