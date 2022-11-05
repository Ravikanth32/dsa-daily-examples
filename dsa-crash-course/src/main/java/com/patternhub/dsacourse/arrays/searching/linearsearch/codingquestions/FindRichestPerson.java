package com.patternhub.dsacourse.arrays.searching.linearsearch.codingquestions;

/**
 * @author ravikant_kondepati
 */
public class FindRichestPerson {
    public static void main(String[] args) {
        int[][] persons = {
                {4,5,23},
                {14,15,4},
                {14,5,40},
        };
        findRichPersonWithAmount(persons);
    }
    static void findRichPersonWithAmount(int[][] persons){
        int richPerson = 0;
        int amount = 0;
        for (int person = 0; person < persons.length; person++) {
            int perAmount = 0;
            for (int account = 0; account < persons[person].length; account++) {
                perAmount = perAmount + persons[person][account];
            }
            if(perAmount > amount){
                richPerson = person;
                amount = perAmount;
            }
        }
        System.out.println("Rich person "+richPerson + " Amount "+amount);
    }
}
