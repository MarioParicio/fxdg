package com.example.quizapp.Model;

import java.util.HashMap;
import java.util.Map;

public class Question {

    String questionTitle;
    String question;
    String TrueAnswer;
    String falseAnswer;


    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getQuestion() {
        return question;
    }

    public String getTrueAnswer() {
        return TrueAnswer;
    }

    public String getFalseAnswer() {
        return falseAnswer;
    }


    public Question(String questionTitle, String question, String trueAnswer, String falseAnswer) {
        this.questionTitle = questionTitle;
        this.question = question;
        TrueAnswer = trueAnswer;
        this.falseAnswer = falseAnswer;
    }









}
