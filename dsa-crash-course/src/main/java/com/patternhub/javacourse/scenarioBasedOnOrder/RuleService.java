package com.patternhub.javacourse.scenarioBasedOnOrder;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RuleService {



    public Optional<Rule> getRuleByOrder(Integer orderId){
        RulesRepository repository = new RulesRepository();
        List<Rule> rules = repository.getRules();
        return rules.stream().filter(rule -> rule.getOrder().equals(orderId))
                .findFirst();
    }

//    public List<Rule> getAllRulesAbove(Integer orderId){
//        return rules;
//    }

    public Boolean updateRuleOrder(Rule updateRule,String condition){
        RulesRepository repository = new RulesRepository();
        List<Rule> rules = repository.getRules();
            int order = updateRule.getOrder();
            if(condition.equals(RuleCondition.REPLACE.name())){
                Optional<Rule> optionalRule= getRuleByOrder(order);
                if(optionalRule.isPresent()){

                }
            }
        if(condition.equals(RuleCondition.INSERT_ABOVE.name())){
            List<Rule> rulesAboveOrder = rules.stream()
                    .filter(rule -> rule.getOrder() >= order)
                    .collect(Collectors.toList());
            rulesAboveOrder.stream()
                    .forEach(System.out::println);
            System.out.println("--------------------- ");
            List<Rule> afterOrderUpdate = changeOrder(rulesAboveOrder);

        }
        if(condition.equals(RuleCondition.INSERT_BELOW.name())){
            List<Rule> rulesAboveOrder = rules.stream()
                    .filter(rule -> rule.getOrder() > order)
                    .collect(Collectors.toList());
        }
        if(condition.equals(RuleCondition.INSERT_AT_END.name())){
            List<Rule> rulesAboveOrder = rules.stream()
                    .filter(rule -> rule.getOrder() > order)
                    .collect(Collectors.toList());
        }
        return true;
    }

    public List<Rule> changeOrder(List<Rule> rulesAboveOrder){
        List<Rule> afterOrderChange = rulesAboveOrder.stream()
                .map(rule -> Rule.builder().name(rule.getName()).order(rule.getOrder()+1).build())
                .collect(Collectors.toList());
        return afterOrderChange;
    }
}
