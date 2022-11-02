package com.patternhub.objectMapperExample;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.stream.Collectors;

public class ItemSerializer extends StdSerializer<Rule> {
    
    public ItemSerializer() {
        this(null);
    }
  
    public ItemSerializer(Class<Rule> t) {
        super(t);
    }

    @Override
    public void serialize(
            Rule value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException, JsonProcessingException {
 
        jgen.writeStartObject();
        jgen.writeStringField("name", value.getName());
        jgen.writeStringField("programs",condition(value.getPrograms()));
        jgen.writeStringField("products",condition(value.getProducts()));
        //jgen.writeNumberField("owner", value.owner.id);
        jgen.writeEndObject();
    }

    public String condition(ConditionalList conditionalList){
        String value = "";
        if (conditionalList.getCondition() == ListCondition.ALL || conditionalList.getCondition() == ListCondition.ONLY){
            value = conditionalList.getItems().stream().collect(Collectors.joining(","));
        }
        if (conditionalList.getCondition() == ListCondition.EXCEPT){
            value = conditionalList.getItems().stream().map(item -> "!"+item).collect(Collectors.joining(","));
        }
        return value;
    }
}