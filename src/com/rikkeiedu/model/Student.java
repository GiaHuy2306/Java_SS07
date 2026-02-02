package com.rikkeiedu.model;

public class Student {
    private static int currentId = 1;

    private int id;
    private String fullname;
    private final String className = "RikkeiEducation";
    private double score;

    public Student() {
        this.id = currentId++;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}

