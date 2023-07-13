package example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

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

    // task 1
    @Override
    public String toString() {
        try {
            FileWriter fileWriter = new FileWriter("./DataContainerObject("+ getStringData() +").txt", true);
            fileWriter.write("DataContainer{" +
                    "booleanData=" + booleanData +
                    ", stringData='" + stringData + '\'' +
                    ", intData=" + intData +
                    '}');
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "DataContainer information contains in file";
    }
}
