package com.tizzone.topquiz.model;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoiseList;
    private int mAnswerIndex;

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiseList=" + mChoiseList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }

    public Question(String question, List<String> choiseList, int answerIndex) {
       this.setQuestion(question);
       this.setChoiseList(choiseList);
       this.setAnswerIndex(answerIndex);
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoiseList() {
        return mChoiseList;
    }

    public void setChoiseList(List<String> choiseList) {
        if (choiseList==null) throw new IllegalArgumentException("Array cannot be null");
        mChoiseList = choiseList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        if (answerIndex <0 || answerIndex>=mChoiseList.size())
            throw new IllegalArgumentException("Answer index is out of bound");
        mAnswerIndex = answerIndex;
    }
}
