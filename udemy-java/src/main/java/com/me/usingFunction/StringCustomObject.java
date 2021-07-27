package com.me.usingFunction;

import java.util.ArrayList;
import java.util.List;

public class StringCustomObject extends CustomObject {
    private static final long serialVersionUID = 1L;

    private List<String> values;

    private String value;

    public StringCustomObject() {
        values = new ArrayList<>();
    }

    public List<String> getValues() {
        return values;
    }

    public void addValue(final String value2) {
        values.add(value2);
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void removeAndAddValues(final List<String> newValues) {
        values.clear();
        values.addAll(newValues);
    }
}
