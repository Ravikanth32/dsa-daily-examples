package com.patternhub.scenarioBasedOnOrder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Rule {
    private String name;
    private Integer order;
//    private ConditionalList programs = new ConditionalList();
//    private ConditionalList products = new ConditionalList();
//    private ConditionalList channels = new ConditionalList();
//    private ConditionalList operations = new ConditionalList();
//    private ConditionalList modes = new ConditionalList();

}
