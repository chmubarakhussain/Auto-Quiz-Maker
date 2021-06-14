package com.example.onlinequiz;

public class ColumnModel {
    String First, Second, Correct;

    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getSecond() {
        return Second;
    }

    public void setSecond(String second) {
        Second = second;
    }

    public String getCorrect() {
        return Correct;
    }

    public void setCorrect(String correct) {
        Correct = correct;
    }

    public ColumnModel() {

    }

    public ColumnModel(String first, String second, String correct) {
        this.First = first;
        this.Second = second;
        this.Correct = correct;
    }
}
