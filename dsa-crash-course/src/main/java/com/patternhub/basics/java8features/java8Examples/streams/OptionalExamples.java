package com.patternhub.basics.java8features.java8Examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        //empty
        //of
        //ofNullable

        Person p3 = new Person(null,30,Arrays.asList(567890l,1234599876l));

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> nameOptional = Optional.ofNullable(p3.getName());
        nameOptional.ifPresent(System.out::println);
        System.out.println(nameOptional.orElse("sampel@gm.com"));
//        System.out.println(nameOptional.orElseThrow(IllegalStateException::new));
        System.out.println(nameOptional.map(String::toUpperCase).orElse("default@gma.com"));


        System.out.println(getPeople().stream()
                .filter(person -> ("testing").equals(person.getName()))
                .findAny().orElse(new Person()));
    }

    public static List<Person> getPeople(){

        Person p1 = new Person("ravi",45, Arrays.asList(1234l,1234l));
        Person p2 = new Person("ram",20,Arrays.asList(876547890l,34567887654l));
        Person p3 = new Person(null,30,Arrays.asList(567890l,1234599876l));
        Person p4 = new Person("paul",50,Arrays.asList(987654234l,65432l));
        Person p5 = new Person("venkat",30,Arrays.asList(9876543l,4567876l));

        return Arrays.asList(p1,p2,p3,p4,p5);
    }
}
