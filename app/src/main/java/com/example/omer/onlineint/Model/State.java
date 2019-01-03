package com.example.omer.onlineint.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("State")
    @Expose
    private String state;

    @SerializedName("examid")
    @Expose
    private String examId;

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("examType")
    @Expose
    private String examType;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
