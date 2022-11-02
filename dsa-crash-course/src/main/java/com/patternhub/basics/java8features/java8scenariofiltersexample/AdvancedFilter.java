package com.patternhub.basics.java8features.java8scenariofiltersexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvancedFilter {
    List<String> program;
    List<String> product;

//    FiledFilter program;
//    FiledFilter product;
}
