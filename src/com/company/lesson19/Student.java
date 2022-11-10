package com.company.lesson19;
import java.lang.Object;
public class Student {
    private String name;
    private String surname;
    public Integer age;
    private Boolean available;

    public Student(String name, String surname, Integer age, Boolean available) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.available = available;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
//    public String toString1(){
//
//        return  this.name +" "+ this.surname;
//
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", available=" + available +
                '}';
    }
}
