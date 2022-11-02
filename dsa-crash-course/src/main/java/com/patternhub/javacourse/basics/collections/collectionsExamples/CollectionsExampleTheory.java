package com.patternhub.javacourse.basics.collections.collectionsExamples;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsExampleTheory {

    public static void main(String[] args) {



/*
    Collections are data structures
    1. List
    2. Queue
    3. Set
    4. Map

    Java provided collections and comes from rt.jar(java jdk)

    jar (java archive)

    classes,interfaces -> packages
    classes -> packages

    rt.jar



    maven/gradle this will convert your packages to jar file

 */
        /*
        Collection Interface


        List interface
            ArrayList
            LinkedList
            Vector
            Stack

         Queue Interface
            PriorityQueue

          Deque Interface
            ArrayDeque


         Set Interface

            HashSet
            LinkedSet
          SortedSet Interface
            TreeSet



        /// Wrapper classes

         */

//
//        ArrayList<String> arrayList= new ArrayList();
//
//        arrayList.add("edfa");
//
//
//
//        ArrayList<Employee> employees = new ArrayList<>();



//       ArrayList<Integer> integers = new ArrayList();
//       integers.add(1);
//       integers.add(2);
//       integers.add(3);
//       integers.add(4);
//       integers.add(5);
//       integers.add(5);
//
//
//       ArrayList<Integer> myValues= new ArrayList<>();
//
//       myValues.add(10);
//       myValues.add(100);
//
//
//       integers.addAll(myValues);
//
//
//       ArrayList<Integer> findThem = new ArrayList<>();
//       findThem.add(10);
//       findThem.add(50);
//
//       boolean flag = integers.containsAll(findThem);
//        System.out.println(flag);
//       System.out.println(integers);
//
//        System.out.println(integers.isEmpty());

        //




//
//       boolean flag = integers.contains(10000);
//        System.out.println(flag);

//        System.out.println(integers.size());
//
////        int i = integers.get(5);
//
//        integers.remove(4);
//        System.out.println(integers.size());
//        System.out.println(integers);

//        ArrayList<Integer> remove = new ArrayList();
//        remove.add(1);
//        remove.add(5);
//        integers.removeAll(remove);




//        integers.clear();
//        System.out.println(integers.size());


//       System.out.println(integers);
//       int sum = 0;
//       for (Integer value:integers){
//           sum = sum + value;
//       }
//
//        System.out.println(sum);


//       HashSet<Integer> hashSet = new HashSet();
//       hashSet.add(1);
//       hashSet.add(2);
//       hashSet.add(3);
//       hashSet.add(4);
//       hashSet.add(5);
//       hashSet.add(5);
//
//        System.out.println(hashSet);









//        String s = "10.50p";
////        Integer integer = new Integer(10);
//        //int value = Integer.parseInt(s);
//        double d = Double.parseDouble(s);
//
//        double result = i + d;
//
//        System.out.println(result);



      List<String> names =  new ArrayList();
      List<String> names1 = new LinkedList<>();
      List<String> names2 = new Vector<>();
      Stack<String> names3 = new Stack<>();

      // stack LIFO (LAST IN FIRST OUT)
        // QUEUE FIFO (FIRST IN FIRST OUT)

//        names3.push("ravi");
//        names3.push("venkat");
//        names3.pop();
//
//        System.out.println(names3);


//        PriorityQueue<String> priorityQueue = new PriorityQueue();
//        priorityQueue.add("ravi");
//        priorityQueue.add("ravi kanth");
//        priorityQueue.add("ravi kumar");
//
//        System.out.println(priorityQueue.element());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.poll());

//        List<String> list = new ArrayList<>();
//
//        list.add("ravi");
//        list.add("ravi");
//        list.add("venkat");
//        list.add("abcd");
//        list.add("ram");
//        list.add("somu");
//
//        for (String name : list){
//            System.out.println(name);
//        }
//
//
//        Set<String> setData = new HashSet<>();
//
//        setData.add("ravi");
//        setData.add("ravi");
//        setData.add("venkat");
//        setData.add("abcd");
//        setData.add("ram");
//        setData.add("somu");
//
//        System.out.println("------->");
//        for (String name : setData){
//            System.out.println(name);
//        }

//        System.out.println(setData);
//        Set<String> setData1 = new LinkedHashSet<>();
//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("ravi");
//        treeSet.add("ravi");
//        treeSet.add("venkat");
//        treeSet.add("abcd");
//
//        System.out.println(treeSet);




//        List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();

//        Collections.synchronizedList(list);
//        list.add("ravi");
//        list.add("venkat");
//        list.add("abcd");
//        list.add("ram");
//        list.add("somu");
//
//        for (String name : list){
//            System.out.println(name);
//            list.add(name);
//        }

//       Map Interface -> Hashmap,TreeMap, Hashtable, LinkedHashMap

//        age -> 20
//        name -> ravi

        TreeMap<String,String> raviInfo = new TreeMap<>();
        Hashtable<String,String> raviInfo1 = new Hashtable<>();
        Map<String,String> raviInfo2 = new LinkedHashMap<>();

        raviInfo.put("age","20");
        raviInfo.put("name","ravi");
        raviInfo.put("email","@gm.com");
        raviInfo.put("mobile","2345");

//        System.out.println(raviInfo.get("mobile1"));
//
////        raviInfo.remove("email");
//
//        System.out.println(raviInfo.containsValue("2345"));

        for(Map.Entry entry: raviInfo.entrySet()){
            System.out.println(entry.getKey() + " ---------> " + entry.getValue());

        }


//        Set set = raviInfo.entrySet();
//        Iterator e =set.iterator();
//        while (e.hasNext()){
//            e.next();
//        }



        /// java 8 programming style of change



        ArrayList<Employee> employees = new ArrayList<>();

        Employee.companyName= "patternhub";
        Employee e1 = new Employee(1,"Sandeep",20000.40,2345678);
        Employee e2 = new Employee(2,"ravi",30000.40,2345678);
        Employee e3 = new Employee(3,"venkat",20000.40,2345678);
        Employee e4 = new Employee(4,"sai",25000.40,2345678);
        Employee e5 = new Employee(5,"pal",28000.40,2345678);
        Employee e6 = new Employee(6,"sal",90000.40,2345678);
        Employee e7 = new Employee(7,"dal",20900.40,2345678);
        Employee e8 = new Employee(8,"ram",70000.40,2345678);
        Employee e9 = new Employee(9,"sam",789000.40,2345678);
        Employee e10 = new Employee(10,"veera",875000.40,2345678);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        /*
        1. How many employees name start with r
        2. How many empl sal > 50000
        3. How many emps name start with r and also sal > 50K

         */

        for (Employee e : employees){



        }







    }
}
