package com.atakmap.rest.dataModel;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Deserializer for a dummy object
 *
 * Convert a JsonObject into a Dummy object.
 */
public class WikipediaObjectDeserializer implements JsonDeserializer<WikipediaObject>
{
    @Override
    public WikipediaObject deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException
    {
        final WikipediaObject wikipediaObject = new WikipediaObject();
        final JsonObject jsonObject = (JsonObject) json.getAsJsonObject().getAsJsonObject("query").getAsJsonArray("pages").get(0);
        wikipediaObject.setTitle(jsonObject.get("title").getAsString());
        //  wikipediaObject.setTitle(jsonObject.get("query").getAsString());
        wikipediaObject.setBody(jsonObject.get("extract").getAsString());




        return wikipediaObject;
    }
}
