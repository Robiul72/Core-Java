package stu;

import java.io.Serializable;

public class Bina implements Serializable {

    private String name;
    private int age;

    public Bina() {
    }

    public Bina(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

}
