package org.example.task6;

public enum Color {
    RED("красный"),
    GREEN("зелёный"),
    BLUE("синий"),
    YELLOW("желтый"),
    BROWN("коричневый"),
    PINK("розовый");

    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
