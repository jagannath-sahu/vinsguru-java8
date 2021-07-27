package com.me.usingFunction;

import java.io.Serializable;

public class CustomObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private String attrName;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(final String attrName) {
        this.attrName = attrName;
    }
}
