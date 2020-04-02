package com.example.jmockitdemo.mock;

public class APP {
    Dependency dependency = new Dependency();

    public void printNum(){
        System.out.println(dependency.getNum());
    }

}
