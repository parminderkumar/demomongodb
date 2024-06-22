package com.parminder.demomongodb.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("practitioners")
public class Practitioner {

        private String name;
        private int age;
        private String email;

    public String getName() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Practitioner(String name, int age, String email) {
            super();
            this.name = name;
            this.age = age;
            this.email = email;
        }

}
