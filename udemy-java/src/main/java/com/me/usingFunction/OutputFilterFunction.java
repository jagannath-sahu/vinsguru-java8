package com.me.usingFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class OutputFilterFunction<I extends List<Map<String, CustomObject>>> implements Function<I, List<String>> {

    private String key;

    public OutputFilterFunction(final String key) {
        this.key = key;
    }

    @Override
    public List<String> apply(final I responsesList) {
        List<String> filteredValues = new ArrayList<>();
        responsesList.stream()
                     .filter(responseMap -> responseMap.containsKey(key) && responseMap.get(key) != null)
                     .forEach(responseMap -> {
                    	 StringCustomObject valueAttr = ((StringCustomObject)responseMap.get(key));
                         if (!filteredValues.contains(valueAttr.getValue())) {
                             filteredValues.add(valueAttr.getValue());
                         }
                     });
        return filteredValues;
    }

}