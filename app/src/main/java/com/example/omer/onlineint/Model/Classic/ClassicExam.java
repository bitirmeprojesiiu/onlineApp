package com.example.omer.onlineint.Model.Classic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ClassicExam implements Serializable {

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
    @SerializedName("classicQuestions")
    @Expose
    private List<ClassicQuestion> classicQuestions = null;


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

    public List<ClassicQuestion> getClassicQuestions() {
        return classicQuestions;
    }

    public void setClassicQuestions(List<ClassicQuestion> classicQuestions) {
        this.classicQuestions = classicQuestions;
    }
}
