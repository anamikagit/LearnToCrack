package com.example.aarya.learntocrack.model;

public class Subject {
    private String name;
    private int numOfQuest;

    public Subject() {
    }

    public Subject(String name, int numOfQuest) {
        this.name = name;
        this.numOfQuest = numOfQuest;
    }

    public int getNumOfQuest() {
        return numOfQuest;
    }

    public void setNumOfQuest(int numOfQuest) {
        this.numOfQuest = numOfQuest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
