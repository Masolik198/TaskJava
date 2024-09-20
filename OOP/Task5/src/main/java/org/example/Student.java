package org.example;

import java.util.Random;

public class Student {
    String firstName;
    String lastName;
    int group;
    int averageMark;
    int scholarship;

    public int mark() {
        Random newAverageMark = new Random();
        averageMark = newAverageMark.nextInt(5) + 1;
        return averageMark;
    }

    public int getScholarship() {
        if (averageMark >= 4)
            scholarship = 2000;
        else scholarship = 1900;
        return scholarship;
    }
}