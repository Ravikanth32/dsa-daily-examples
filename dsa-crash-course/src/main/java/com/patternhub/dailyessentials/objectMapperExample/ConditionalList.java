package com.patternhub.dailyessentials.objectMapperExample;

import lombok.Data;

import java.util.List;
@Data
public class ConditionalList {
    private ListCondition condition;
    private List<String> items;
}
