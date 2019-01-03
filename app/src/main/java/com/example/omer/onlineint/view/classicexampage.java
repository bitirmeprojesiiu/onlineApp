package com.example.omer.onlineint.view;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.omer.onlineint.Model.Classic.ClassicExam;
import com.example.omer.onlineint.Model.Classic.ClassicQuestion;
import com.example.omer.onlineint.R;

import java.util.ArrayList;

public class classicexampage extends AppCompatActivity {

    TextView questionNumber;
    TextView timer;
    TextView query;
    EditText answered;
    Button next,back;
    CountDownTimer countDownTimer;
    long timerDuration;
    String[] answers;
    int[] checked;
    ClassicExam classicExams=new ClassicExam();
    String backString="Back",nextString="next",Question="Question ",finish="Finish";
    int  unAnswered,number,iterator=0;
//Dump data
    ArrayList<ClassicQuestion> classicQuestionArrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classicexam);

        answered=findViewById(R.id.ceditText);
        query =findViewById(R.id.cquery);
        next=findViewById(R.id.cnext);
        back=findViewById(R.id.cback);
        questionNumber =findViewById(R.id.cQuestionNumber);
        timer =findViewById(R.id.ctimer);

        classicExams.setDuration("1");
        classicExams.setExamid("qwewd");
        classicExams.setFormat("test");
        classicExams.setNumber("5");
        number=Integer.parseInt(classicExams.getNumber());

        timerDuration=Long.parseLong(classicExams.getDuration())*(60 * 1000);

        StartTimer();

        //dumpp data
        classicQuestionArrayList.add(new ClassicQuestion("adınız nedir"));
        classicQuestionArrayList.add(new ClassicQuestion("soy adınız nedir"));
        classicQuestionArrayList.add(new ClassicQuestion("yaşınız nedir"));
        classicQuestionArrayList.add(new ClassicQuestion("adresiniz nedir"));
        classicQuestionArrayList.add(new ClassicQuestion("telefon numaranız nedir"));
        classicExams.setClassicQuestions(classicQuestionArrayList);
        checked= new int[Integer.parseInt(classicExams.getNumber())];
        answers=new String[Integer.parseInt(classicExams.getNumber())];




        query.setText(classicExams.getClassicQuestions().get(0).getQuestionString().toString());
        next.setText(nextString);
        back.setText(backString);
        questionNumber.setText("Question 1");

        back.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);
        iterator=0;


        for(int i=0;i<checked.length;i++){
            checked[i]=-5;
            answers[i]="null"; }}


    public void Back(View view) {

        if(!TextUtils.isEmpty(answered.getText().toString())) {
            answers[iterator]=answered.getText().toString(); }

        iterator=iterator-1;

        if (iterator == 0) {
            back.setVisibility(View.INVISIBLE);
        }


        if(answers[iterator].equals("null")){

        }
        else{
            answered.getText().clear();
            answered.setText(answers[iterator]);

            query.setText(classicExams.getClassicQuestions().get(iterator).getQuestionString());
            questionNumber.setText(Question + (iterator+1 ));
            next.setText(nextString);
        }
        }


    public void Next(View view) {

        if(!TextUtils.isEmpty(answered.getText().toString())){
            answers[iterator]=answered.getText().toString();
        }

        if ((number-1)==iterator) {

            Intent i = new Intent(this, CandidateInfo.class);
            i.putExtra("trueAns", answers);
            i.putExtra("unAnswered", unAnswered);
            startActivity(i); }

        else{
            iterator=iterator+1;
            if (iterator == (number-1)) {
                next.setText(finish); }
            answered.getText().clear();
            if(!answers[iterator].equals("null")){
                answered.setText(answers[iterator],TextView.BufferType.EDITABLE); }
            query.setText(classicExams.getClassicQuestions().get(iterator).getQuestionString());
            back.setVisibility(View.VISIBLE);
            questionNumber.setText(Question + (iterator + 1));

        }}








    public void StartTimer(){

        countDownTimer=new CountDownTimer(timerDuration,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                //timerDuration=millisUntilFinished;
                long secLeft =(millisUntilFinished/1000)%60;
                long minLeft=(millisUntilFinished/60)/1000;
                timer.setText(Long.toString(minLeft)+":"+Long.toString(secLeft));

            }

            @Override
            public void onFinish() {

                setFinish();

            }
        }.start(); }




    void setFinish(){

       Intent i = new Intent(this, CandidateInfo.class);
       Bundle b= new Bundle();
       //b.putStringArrayList(answers);
        startActivity(i);
    }


}
