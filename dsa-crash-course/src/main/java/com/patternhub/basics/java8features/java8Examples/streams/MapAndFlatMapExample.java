package com.patternhub.basics.java8features.java8Examples.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapAndFlatMapExample {

    public static void main(String[] args) {

        final List<String> names = getPeople().stream()
                .map(Person::getName)
                .collect(toList());
        System.out.println(names);

//        List<List<Long>> phoneNumbers = getPeople().stream()
//                .map(person -> person.getPhoneNumbers())
//                .collect(toList());
//
//        System.out.println(phoneNumbers);

        List<Long> phoneNumbers = getPeople().stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .sorted()
                .distinct()
                .skip(2)
                .limit(3)
                .collect(toList());

        System.out.println(phoneNumbers);

    }

    public static List<Person> getPeople(){

        Person p1 = new Person("ravi",45,Arrays.asList(1234l,1234l));
        Person p2 = new Person("ram",20,Arrays.asList(876547890l,34567887654l));
        Person p3 = new Person("venkat",30,Arrays.asList(567890l,1234599876l));
        Person p4 = new Person("paul",50,Arrays.asList(987654234l,65432l));
        Person p5 = new Person("venkat",30,Arrays.asList(9876543l,4567876l));

        return Arrays.asList(p1,p2,p3,p4,p5);
    }
}
