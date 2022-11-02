package com.patternhub.objectMapperExample;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ConditionalListSerializer extends StdSerializer<ConditionalList> {
    public ConditionalListSerializer(Class clazz) {
        super(clazz);
    }
    public ConditionalListSerializer() {
        this(null);
    }

    @Override
    public void serialize(ConditionalList conditionalList, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("programs", conditionalList.getItems().toString());
        //jgen.writeStringField("itemName", value.itemName);
        //jgen.writeNumberField("owner", value.owner.id);
        jsonGenerator.writeEndObject();
    }
}
