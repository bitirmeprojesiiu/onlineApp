package com.example.omer.onlineint.viewmodel;

import com.example.omer.onlineint.Model.Test.TestExam;

public class testviewmodel {

    private TestExam testExam;
    private String SelectedRB;
    private boolean isSelected;

    public TestExam getTestExam() {
        return testExam;
    }

    public void setTestExam(TestExam testExam) {
        this.testExam = testExam;
    }

    public String getSelectedRB() {
        return SelectedRB;
    }

    public void setSelectedRB(String selectedRB) {
        SelectedRB = selectedRB;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
