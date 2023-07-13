package org.example.example;

public class DataContainer {
    private Boolean booleanData;

    private String stringData;
    private Integer intData;

    public DataContainer(Boolean booleanData, Integer intData,  String stringData) {
        this.booleanData = booleanData;
        this.intData = intData;
        this.stringData = stringData;
    }

    public void setBooleanData(Boolean booleanData) {
        this.booleanData = booleanData;
    }

    public Boolean getBooleanData() {
        return booleanData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public Integer getIntData() {
        return intData;
    }

    public void setIntData(Integer intData) {
        this.intData = intData;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "booleanData=" + booleanData +
                ", stringData='" + stringData + '\'' +
                ", intData=" + intData +
                '}';
    }
}
