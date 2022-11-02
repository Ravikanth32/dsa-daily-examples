package com.patternhub.javacourse.advancedconcepts.java8features.asyncProgramming;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {
    Long id;
    String firstName;
    String lastName;
    String email;
    Long phone;
}
