package com.me.usingFunction;

import java.io.Serializable;

public class CustomObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private String attrName;

    private RequestType requestType;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(final String attrName) {
        this.attrName = attrName;
    }

    public RequestType getRequestDataType() {
        return requestType;
    }

    public void setRequestDataType(final RequestType requestDataType) {
        this.requestType = requestDataType;
    }
}
