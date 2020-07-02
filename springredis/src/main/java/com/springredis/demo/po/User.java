package com.springredis.demo.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 6276247234408879935L;

    private String name;
    private Integer age;
    private Integer weight;
    private String sex;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
