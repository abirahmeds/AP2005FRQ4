package com.company;

public class StudentRecord {
    private int[] scores;

    StudentRecord(int... scores) {
        this.scores = scores;
    }

    private double average(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++)
            sum += scores[i];
        return (double) sum / (last - first + 1);
    }

    boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] > scores[i])
                return false;
        }
        return true;
    }

    double finalAverage() {
        if (hasImproved())
            return average(scores.length / 2, scores.length - 1);
        return average(0, scores.length - 1);
    }
}