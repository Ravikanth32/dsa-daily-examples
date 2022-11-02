package com.patternhub.codingproblems.easy.arrays;

public class ArraysRotation {

    static void leftRotate(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int numOfRotation = 7;
        for(int x = 0; x< numOfRotation; x++)
            leftRotate(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}
