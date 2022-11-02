package com.patternhub.advancedconcepts.java8features.java8Examples.streams;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamCollectorsGroupByExample {
    public static void main(String[] args) {

//        getPeople().forEach(System.out::println);

//        Map<String, List<Person>> collect = getPeople().stream()
//                .collect(Collectors.groupingBy(Person::getName));

        Map<String, Long> collect = getPeople().stream()
                .collect(groupingBy(Person::getName,counting()));

//        collect.entrySet().forEach(e -> System.out.println(e.getKey()+" ---> "+ (e.getValue())));
//        Map<String, Long> longMap = getData().stream().collect(groupingBy(x -> x, counting()));
        Map<String, Integer> longMap = getStringData().stream()
                .collect(groupingBy(x -> x,
                        collectingAndThen(counting(), Long::intValue)));

//        longMap.entrySet().forEach(e -> System.out.println(e.getKey()+"   "+e.getValue()));

//        System.out.println(getStringData().stream().distinct().collect(toList()));

//        System.out.println((Integer) getPeople().stream().map(Person::getAge).mapToInt(x -> x.intValue()).sum());

        // find max characters in person name

        getPeople().stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .max()
                .ifPresent(System.out::println);

        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        getPeople().stream()
                .sorted(ageComparator)
                .forEach(System.out::println);
        // All Match

        boolean allMatch = getPeople().stream()
                .allMatch(person -> person.getAge() >=50);
        System.out.println(allMatch);

        boolean anyMatch = getPeople().stream()
                .anyMatch(person -> person.getAge() >= 50);
        System.out.println(anyMatch);


        boolean noneMatch = getPeople().stream()
                .noneMatch(person -> person.getAge() >= 100);
        System.out.println(noneMatch);


        getPeople().stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> System.out.println(person.getAge()));

        //GroupBy

        getPeople().stream()
                .collect(groupingBy(Person::getName))
                .forEach((name, person) -> System.out.println(name+"---"+person));


        getPeople().stream()
                //.collect(groupingBy(Person::getName,toList()))
                .collect(groupingBy(Person::getName,toSet()))
                .forEach((name, person) -> System.out.println(name+"---"+person));

        getPeople().stream()
                .collect(groupingBy(Person::getName,mapping(Person::getName,toList())))
                .forEach((name, person) -> System.out.println(name+"---"+person));


        getPeople().stream()
                .collect(groupingBy(Person::getAge, Hashtable::new,toList()))
                .forEach((name, person) -> System.out.println(name+" --->"+person));


        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");

        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"  "+entry.getValue()));
//        map.forEach((key,value) -> System.out.println(key+"  "+ value));


    }

    public static List<Person> getPeople(){

        Person p1 = new Person("ravi",45);
        Person p2 = new Person("ram",20);
        Person p3 = new Person("venkat",30);
        Person p4 = new Person("paul",50);
        Person p5 = new Person("venkat",30);

        return Arrays.asList(p1,p2,p3,p4,p5);
    }

    public static List<String> getStringData(){
        return Arrays.asList("a","b","c","d","a");
    }
}
