package com.patternhub.javacourse.corebasics.io.ioExamples;

import java.io.*;

public class SerializationExamples {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Sandeep",1234,10);

        FileOutputStream outputStream = new FileOutputStream("output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();


        ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
        Student s=(Student)in.readObject();
        //printing the data of the serialized object
        System.out.println(s.getName() + "-->"+ s.getRoolNum() +"-----> Age "+ s.getAge());


    }
}


class Student implements Serializable {
    private String name;
    private long roolNum;
    private transient int age;

    private static final long serialVersionUID = 1L;

    public Student(String name, long roolNum, int age) {
        this.name = name;
        this.roolNum = roolNum;
        this.age= age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRoolNum() {
        return roolNum;
    }

    public void setRoolNum(long roolNum) {
        this.roolNum = roolNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roolNum=" + roolNum +
                '}';
    }
}