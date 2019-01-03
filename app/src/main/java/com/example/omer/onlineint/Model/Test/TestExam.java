
package com.example.omer.onlineint.Model.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestExam implements Serializable {

    @SerializedName("examid")
    @Expose
    private String examid;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("testQuestions")
    @Expose
    private ArrayList<TestQuestion> testQuestions = null;

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ArrayList<TestQuestion> getTestQuestions() {
        return testQuestions;
    }

    public void setTestQuestions(ArrayList<TestQuestion> testQuestions) {
        this.testQuestions = testQuestions;
    }
}
