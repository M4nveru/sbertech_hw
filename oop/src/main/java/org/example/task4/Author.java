package org.example.task4;

public class Author {
    private String name;
    private Sex sex;
    private String email;

    public Author(String name, Sex sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author name: " + name + " (" + sex +
                "), email: " + email;
    }
}
enum Sex{
    MAN,
    WOMAN
}
