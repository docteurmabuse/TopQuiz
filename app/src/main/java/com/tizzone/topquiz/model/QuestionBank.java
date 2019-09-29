package com.tizzone.topquiz.model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {
    List<Question> mQuestionList;
    private int mNextQuestionIndex;
    public QuestionBank(List<Question> questionList){
    mQuestionList=questionList;

    // Shuffle the question list
        Collections.shuffle(mQuestionList);
        mNextQuestionIndex=0;
    }
    public Question getQuestion(){
    return null;
    }
}
