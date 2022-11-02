package com.patternhub.javacourse.advancedconcepts.oopsconcepts.interfaceExample;

import java.util.Objects;

public interface Animal {
     int x = 10;

     void eating();
     void walking();
     void drinking();
     void hunting();

}

class Tiger implements Animal{



    public void ruling(){

        System.out.println("I am ruling"+x);

    }


    @Override
    public void eating() {
        System.out.println("");
    }

    @Override
    public void walking() {

    }

    @Override
    public void drinking() {

    }

    @Override
    public void hunting() {

    }
}





interface A{
    void m1();


}


interface B{
    void m1();
    void m2();
    default void m3(){
        System.out.println("m3");
    }

    static void m4(){
        System.out.println("m4");
    }

}


class Class1 implements A, B{


    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}



class Class2 implements A{

    @Override
    public void m1() {

    }
}


class Class3 implements B{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        m3();
    }

    @Override
    public void m3(){
        System.out.println("m333");
        B.m4();
    }


}


//////////



interface I1{
    void m1();
}

interface I2{
    void m2();
}

interface I3 extends I1,I2{
    void m3();
}


 class Testing implements I3{


    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

     @Override
     public void m3() {
         System.out.println("m3");
     }
 }

// class ClaasA{
//     public static void main(String[] args) {
//
////         I3 i3 = new I3();
//
//        Testing testing = new Testing();
//        testing.m1();
//        testing.m2();
//        testing.m3();
//
//     }
// }



 class X{
    void m1(){
        System.out.println("m1");
    }
 }

 class Y extends X{

    void m2(){
        System.out.println("m2");
    }
 }


// class ClaasA{
//     public static void main(String[] args) {
//
//         ClaasA example = new ClaasA();
//         example.testing();
//
//     }
//
//     public void testing(){
//        Y y = new Y();
//         y.m1();
//         y.m2();
//     }
// }


 //What is Marker interface
// Serilizable cloneable
interface I4{

}


class XYZ implements Cloneable{




}



/// object class
/// inheritance
/// ploymorphism( method overloading and over ridding)



class User{

    String name;
    String email;
    String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equalsIgnoreCase(user.name) && email.equals(user.email) && password.equals(user.password) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email,password);
    }
}


class Testing1{
    public static void main(String[] args) {
        User user = new User();
        user.name = "ravi";
        user.email= "email";
        user.password="pwd";
        System.out.println(user);


        User user1 = new User();
        user1.name = "Ravi";
        user1.email= "email";
        user1.password="pwd";

        System.out.println(user.equals(user1));


//        String name = "ravi";
//
//        String name1 = "ravi";
//
//        System.out.println(name.equals(name1));

    }
}




