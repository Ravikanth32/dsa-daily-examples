package com.patternhub.javacourse.dailyessentials.objectMapperExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonToPojoTesting {
    public static void main(String[] args) {
        ObjectMapper jsonMapper = new ObjectMapper();
        Rule rule = new Rule();
        rule.setName("rule1");
        ConditionalList programs = new ConditionalList();
        programs.setCondition(ListCondition.ALL);
        programs.setItems(Arrays.asList("DEAL", "IOI"));
        rule.setPrograms(programs);

        ConditionalList products = new ConditionalList();
        products.setCondition(ListCondition.EXCEPT);
        products.setItems(Arrays.asList("EQ", "PF"));
        rule.setProducts(products);

        Rule rule1 = new Rule();
        rule1.setName("rule1");
        ConditionalList programs1 = new ConditionalList();
        programs1.setCondition(ListCondition.ONLY);
        programs1.setItems(Arrays.asList("DEAL", "IOI"));
        rule1.setPrograms(programs1);

        ConditionalList products1 = new ConditionalList();
        products1.setCondition(ListCondition.ALL);
        products1.setItems(Arrays.asList("EQ", "PF"));
        rule1.setProducts(products1);

        List<Rule> rules = Arrays.asList(rule, rule1);

        Map<String,List<Rule>> rulesData = new HashMap<>();
        rulesData.put("rules",rules);

        try {
            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addSerializer(Rule.class,new ItemSerializer());
            simpleModule.addSerializer(ConditionalList.class, new ConditionalListSerializer());
            //jsonMapper.registerModule(simpleModule);
            //jsonMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
            //ObjectNode objectNode = jsonMapper.createObjectNode();
            //objectNode.put("rules",rules);
//            JsonNode node = jsonMapper.valueToTree(rules);
//            jsonMapper.writeValue(destination, node);
//            ObjectNode newNode = (ObjectNode) node.putObject("rules");
            String jsonData = jsonMapper.writeValueAsString(rulesData);
//            jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
//            jsonMapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
            System.out.println("-------> " + jsonData);
//            System.out.println("-------> " + node);
//            System.out.println("-------> " + newNode);




        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
