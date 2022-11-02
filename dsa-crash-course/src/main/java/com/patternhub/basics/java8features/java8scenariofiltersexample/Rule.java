package com.patternhub.basics.java8features.java8scenariofiltersexample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Rule {
    String ruleName;
    List<String> programs;
    List<String> products;
}
