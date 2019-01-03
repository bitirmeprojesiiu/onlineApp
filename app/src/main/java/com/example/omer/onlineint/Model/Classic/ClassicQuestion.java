package com.example.omer.onlineint.Model.Classic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ClassicQuestion implements Serializable {

    @SerializedName("question_number")
    @Expose
    private String questionNumber;
    @SerializedName("question_string")
    @Expose
    private String questionString;

    public ClassicQuestion(String questionString) {
        this.questionString = questionString;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

}
