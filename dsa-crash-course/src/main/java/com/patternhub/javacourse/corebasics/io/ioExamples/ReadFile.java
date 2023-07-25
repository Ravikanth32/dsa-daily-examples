package com.patternhub.javacourse.corebasics.io.ioExamples;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {
    public static void main(String[] args)  {

//        File file = new File("/Users/ravikant_kondepati/Documents/PersonalLearning/Java/java-daily-code-examples/src/main/java/com/patternhub");
//        String[] names = file.list();
//
//        for(String name: names){
//            System.out.println(name);
//        }

//        try {
//            readFile();
//        }catch (Exception e){
//
//        }

        readFile();



    }

    public static void readFile(){

        z();
    }

    public static void z() {

//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("sample.txt");
//            int i;
//            while ((i = fileReader.read()) != -1){
//                System.out.print((char) i);
//            }
//        }catch (Exception e){
//
//        }


        try {
            InputStream stream = new FileInputStream("sample.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
