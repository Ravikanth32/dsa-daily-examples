package com.patternhub.basics.io.ioExamples;

import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {

//        try {
//            OutputStream outputStream= new FileOutputStream("output.txt");
//            Writer writer= new OutputStreamWriter(outputStream);
//            outputStream.write(Integer.parseInt("65"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            testing();
//        }catch (SandeepException e){
//            System.out.println(e);
//        }

        printDate();


    }

    public static void printDate(){
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate tomorrow = now.plusDays(1);
        System.out.println(tomorrow);
        DayOfWeek day = tomorrow.getDayOfWeek();

        System.out.println(day.getValue());
    }



    private static void testing() throws SandeepException {
        FileWriter fileWriter = null;
        try {
             fileWriter = new FileWriter("output.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter you details to write file");
            String content = scanner.nextLine();
            fileWriter.write(content);
            throw new SandeepException("my exception");
        } catch (Exception e) {
            System.out.println(" I am in catch");
            e.printStackTrace();
        }finally {
            System.out.println("I am in finnaly");
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



class SandeepException extends Exception{
    public  SandeepException(String errm){
        super(errm);
    }
}