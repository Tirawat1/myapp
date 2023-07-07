package myapp;

import java.util.Date;

public class Cat extends Date {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public String sayTheyName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
