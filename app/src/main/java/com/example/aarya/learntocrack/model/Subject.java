package com.example.aarya.learntocrack.model;

public class Subject {
    private String name;
    private int numOfQuest;
    private int thumbnail;

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Subject() {
    }

    public Subject(String name, int numOfQuest,int thumbnail) {
        this.name = name;
        this.numOfQuest = numOfQuest;
        this.thumbnail = thumbnail;
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
