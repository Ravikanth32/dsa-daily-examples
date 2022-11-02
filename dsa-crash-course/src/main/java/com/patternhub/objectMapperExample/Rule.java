package com.patternhub.objectMapperExample;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "rules")
public class Rule {
    private String name;
    private Integer order;
    private ConditionalList programs = new ConditionalList();
    private ConditionalList products = new ConditionalList();
//    private ConditionalList channels = new ConditionalList();
//    private ConditionalList operations = new ConditionalList();
//    private ConditionalList modes = new ConditionalList();

}
