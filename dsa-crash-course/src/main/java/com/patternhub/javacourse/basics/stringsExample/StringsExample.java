package com.patternhub.javacourse.basics.stringsExample;

public class StringsExample {

    public static void main(String[] args) {
//        String name = "sandeep";
//        String name1 = "Sandeep";
//        String company = new String("infosys");
//
//        char[] chars = name.toCharArray();
//
//        boolean flag = name.contains("sw");
//
//        if(flag){
//            System.out.println(" found");
//        }else{
//            System.out.println("not found");
//        }
//
//        System.out.println(name.concat(company));
//
//
////        String captialName = name.toUpperCase();
////        String captialName1 = name1.toUpperCase();
////        System.out.println(captialName);
////
////        System.out.println(captialName.equals(captialName1));
//
//
//        System.out.println(name.equalsIgnoreCase(name1));
//        System.out.println(name.endsWith("rav"));


//        String[] names = {"ravi","venkat","sandeep","ram","sampath","kumar"};
//
//        int count = 0;
//        for (String s : names){
//            if(s.startsWith("ra")) {
//                //count = count + 1;
//                count++;
//            }
//
//        }
//        System.out.println(count);
//        System.out.println(names.length-count);

//        String s = "null";
//        String s1 = "ravi";
//
//        System.out.println(s.equals(s1));


        String s = " ravi kanth ";

        System.out.println(s.length());
//        System.out.println(s.isBlank());

        String l = s.trim();
        System.out.println(l.length());
        System.out.println(l);

        System.out.println(s);

//        String afterReplace = s.replace("i","j");
//        System.out.println(afterReplace);


        StringBuffer name = new StringBuffer("sandeep");
        StringBuilder name1 = new StringBuilder("sandeep");

        name.append(" .s");
        name1.append(" .k");

        System.out.println(name);
        System.out.println(name1);

        System.out.println(s.substring(2,4));






//        for (int i = 1; i < names.length; i++) {
//            System.out.println(names[i]);
//        }




        //charAt()
        // concat(
        //equ

//        boolean flag = false;
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == 'w'){
//                flag = true;
//            }
//        }
//
//        if(flag){
//            System.out.println("W found");
//        }else{
//            System.out.println("W not found");
//        }


//        System.out.println(chars[2]);

//        char c = name.charAt(10);
//        System.out.println(c);





    }
}
