package com.patternhub.dsacourse.arrays.searching.linearsearch;

/**
 * @author ravikant_kondepati
 */
public class LinearSearchStringExample {
    public static void main(String[] args) {
        String name = "ravikant_kondepati";
        char target = 'e';
        System.out.println("Is " + target + " found " + isCharExists1(name, target));
        System.out.println("Is " + target + " found " + isCharExists2(name, target));
    }

    public static boolean isCharExists1(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (c == target) return true;
        }
        return false;
    }

    public static boolean isCharExists2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) return true;
        }
        return false;
    }
}
