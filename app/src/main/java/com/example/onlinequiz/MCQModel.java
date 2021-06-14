package com.example.onlinequiz;

public class MCQModel {
    String description, ChoiceA, ChoiceB, ChoiceC, correctChoice;

    public MCQModel() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChoiceA() {
        return ChoiceA;
    }

    public void setChoiceA(String choiceA) {
        ChoiceA = choiceA;
    }

    public String getChoiceB() {
        return ChoiceB;
    }

    public void setChoiceB(String choiceB) {
        ChoiceB = choiceB;
    }

    public String getChoiceC() {
        return ChoiceC;
    }

    public void setChoiceC(String choiceC) {
        ChoiceC = choiceC;
    }

    public String getCorrectChoice() {
        return correctChoice;
    }

    public void setCorrectChoice(String correctChoice) {
        this.correctChoice = correctChoice;
    }

    public MCQModel(String description, String choiceA, String choiceB, String choiceC, String correctChoice) {
        this.description = description;
        ChoiceA = choiceA;
        ChoiceB = choiceB;
        ChoiceC = choiceC;
        this.correctChoice = correctChoice;
    }
}
