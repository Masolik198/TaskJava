package org.example;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, int group, int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Aspirant() {
        firstName = "Nika";
    }

    @Override
    public int getScholarship() {
        if (averageMark >= 4)
            scholarship = 2500;
        else scholarship = 2000;
        return scholarship;
    }
}