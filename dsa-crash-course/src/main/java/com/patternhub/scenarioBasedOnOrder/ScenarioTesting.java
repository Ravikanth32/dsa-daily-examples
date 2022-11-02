package com.patternhub.scenarioBasedOnOrder;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScenarioTesting {

    static List<Rule> sameOrderRules = new ArrayList<>();

    static {
        sameOrderRules.add(Rule.builder().name("rules5").order(5).build());
        sameOrderRules.add(Rule.builder().name("rulessomehting").order(5).build());
        sameOrderRules.add(Rule.builder().name("rules6").order(6).build());
        sameOrderRules.add(Rule.builder().name("rules7").order(7).build());
        sameOrderRules.add(Rule.builder().name("rules7").order(7).build());
//        sameOrderRules.add(Rule.builder().name("rules7").order(7).build());
    }
    public static void main(String[] args) {
//        RuleService ruleService = new RuleService();
//        String ruleCondition= RuleCondition.INSERT_ABOVE.name();
//        sameOrderRules.stream()
//                .forEach( rule -> {
//                    ruleService.updateRuleOrder(rule,ruleCondition);
//                });

        Map<Integer, Long> collect = sameOrderRules.stream()
                .collect(Collectors.groupingBy(Rule::getOrder, Collectors.counting()));

        List<Integer> listOfDuplicateOrders = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(listOfDuplicateOrders);

    }
}
