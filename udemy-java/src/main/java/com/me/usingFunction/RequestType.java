package com.me.usingFunction;

import java.io.Serializable;

public enum RequestType implements Serializable {
    INT(1),
    LONG(2),
    DOUBLE(3),
    BOOLEAN(4),
    STRING(5),
    DATE(6);

    private int dataType;

    RequestType(final int dataType) {
        this.dataType = dataType;
    }

    public int getDataType() {
        return dataType;
    }

    public static RequestType matchDataType(final String dataTypeName) {
        switch (dataTypeName) {
            case "int":
                return RequestType.INT;
            case "long":
                return RequestType.LONG;
            case "double":
                return RequestType.DOUBLE;
            case "string":
                return RequestType.STRING;
            case "boolean":
                return RequestType.BOOLEAN;
            case "date":
                return RequestType.DATE;
            default:
                return null;
        }
    }
}
