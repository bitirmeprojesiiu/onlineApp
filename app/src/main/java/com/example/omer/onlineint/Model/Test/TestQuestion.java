
package com.example.omer.onlineint.Model.Test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestQuestion {

    @SerializedName("question_number")
    @Expose
    private String questionNumber;
    @SerializedName("question_string")
    @Expose
    private String questionString;
    @SerializedName("question_answer")
    @Expose
    private String questionAnswer;
    @SerializedName("choice1")
    @Expose
    private String choice1 = null;
    @SerializedName("choice2")
    @Expose
    private String choice2 = null;
    @SerializedName("choice3")
    @Expose
    private String choice3 = null;
    @SerializedName("choice4")
    @Expose
    private String choice4 = null;

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
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

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }



}
