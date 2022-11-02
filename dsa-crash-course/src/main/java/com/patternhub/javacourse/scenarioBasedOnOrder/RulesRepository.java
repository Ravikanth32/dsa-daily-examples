package com.patternhub.javacourse.scenarioBasedOnOrder;

import java.util.ArrayList;
import java.util.List;

public class RulesRepository {
    static List<Rule> rules = new ArrayList<>();

    static {
        rules.add(Rule.builder().name("rules1").order(1).build());
        rules.add(Rule.builder().name("rules2").order(2).build());
        rules.add(Rule.builder().name("rules3").order(3).build());
        rules.add(Rule.builder().name("rules4").order(4).build());
        rules.add(Rule.builder().name("rules5").order(5).build());
        rules.add(Rule.builder().name("rules6").order(6).build());
        rules.add(Rule.builder().name("rules7").order(7).build());
    }
    public List<Rule> getRules(){
        return rules;
    }

    public void updateRule(Rule rule){
//        rules.stream()
//                .filter(rule -> r)
    }
}
