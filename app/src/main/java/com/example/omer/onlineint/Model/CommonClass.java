package com.example.omer.onlineint.Model;

import com.example.omer.onlineint.Model.Classic.ClassicExam;
import com.example.omer.onlineint.Model.Test.TestExam;

import java.io.Serializable;

public class CommonClass implements Serializable {

    private TestExam testExam;
    private ClassicExam classicExam;
    private boolean flag;
    private String examtype;

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public TestExam getTestExam() {
        return testExam;
    }

    public void setTestExam(TestExam testExam) {
        this.testExam = testExam;
    }

    public ClassicExam getClassicExam() {
        return classicExam;
    }

    public void setClassicExam(ClassicExam classicExam) {
        this.classicExam = classicExam;
    }
}
