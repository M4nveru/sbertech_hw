package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// task 3
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataContainer {
    public Boolean booleanData;

    private String stringData;
    private Integer intData;
}
