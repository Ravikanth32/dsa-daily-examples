package com.patternhub.javacourse.basics.exceptionhandling;

/**
 * @author ravikant_kondepati
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        arithmeticExceptionExample();
        indexOutOfBoundExceptionExample();
        try {
            m0();
        }catch (RuntimeException ex){
            System.out.println("Handled "+ex.getMessage());
        }
    }
    static void arithmeticExceptionExample(){
        int x = 10;
        int y = 0;
        int result = 0;
        try {
            result = x / y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    static void indexOutOfBoundExceptionExample(){
        int[] numbers = {1,4,6,7,8};
        try {
            System.out.println(numbers[10]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void m0(){
        System.out.println(" I am in m1");
        m2();
        throw new RuntimeException("just throwing exception");
    }
    static void m1(){
        System.out.println(" I am in m2");
        try {
            m2();
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }

    }
    static void m2() throws RuntimeException{
        System.out.println(" I am in m2");
        m3();
    }
    static void m3(){
        System.out.println(" I am in m3");
        throw new RuntimeException("just throwing exception in m3");
    }
}
