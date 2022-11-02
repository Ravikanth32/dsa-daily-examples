package com.patternhub.basics.java8features.asyncProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {

    public Optional<List<User>> getAllUsers(){
        System.out.println("Fetching all the users...");
        User user1 = User.builder().id(1L).firstName("fname1").lastName("lName1").email("r1@gmail.com").phone(123L).build();
        User user2 = User.builder().id(2L).firstName("fname2").lastName("lName2").email("r2@gmail.com").phone(234L).build();
        User user3 = User.builder().id(3L).firstName("fname2").lastName("lName2").email("r2@gmail.com").phone(345L).build();
        List<User> users =Arrays.asList(user1,user2,user3);
        return  Optional.of(users);
    }

}
