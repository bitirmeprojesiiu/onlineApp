package com.example.omer.onlineint.view;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.omer.onlineint.Model.Test.TestExam;
import com.example.omer.onlineint.Model.Test.TestQuestion;
import com.example.omer.onlineint.R;

import java.util.ArrayList;

public class testexampage extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4,temp;
    RadioGroup rg;
    Button next,back;
    TextView query;
    TextView questionNumber;
    TextView timer;

    int iterator,trueAns,falseAns, unAnswered,number,duration,iterhold;
    TestExam testExam=new TestExam();
    String backString="Back",nextString="next",Question="Question ",finish="Finish";
    String[] answers;
    int[] checked;
    ArrayList<TestQuestion> testQuestionsArr=new ArrayList<>();
    TestQuestion testQuestions=new TestQuestion();
    TestQuestion testQuestions1=new TestQuestion();
    TestQuestion testQuestions2=new TestQuestion();
    TestQuestion testQuestions3=new TestQuestion();
    TestQuestion testQuestions4=new TestQuestion();
    CountDownTimer countDownTimer;
    long timerDuration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testexam);

        query=findViewById(R.id.query);
        next=findViewById(R.id.next);
        back=findViewById(R.id.back);
        questionNumber =findViewById(R.id.questionNumber);
        rg=findViewById(R.id.rg);
        timer =findViewById(R.id.timer);
        rb1=findViewById(R.id.a);
        rb2=findViewById(R.id.b);
        rb3=findViewById(R.id.c);
        rb4=findViewById(R.id.d);





        testExam.setDuration("1");
        testExam.setExamid("qwewd");
        testExam.setFormat("test");
        testExam.setNumber("5");


        timerDuration=Long.parseLong(testExam.getDuration())*(60 * 1000);
        checked= new int[Integer.parseInt(testExam.getNumber())];
        answers=new String[Integer.parseInt(testExam.getNumber())];

        testQuestions1.setQuestionString("sadaba");
        testQuestions1.setChoice1("adasssna");
        testQuestions1.setChoice2("burssdsdsda");
        testQuestions1.setChoice3("cadsdsdana");
        testQuestions1.setChoice4("dadddfdfaba");
        testQuestions1.setQuestionAnswer("sadaba");
        testQuestionsArr.add(testQuestions1);

        testQuestions2.setQuestionString("adınertyu");
        testQuestions2.setChoice1("adaşşlllşna");
        testQuestions2.setChoice2("burtyuosa");
        testQuestions2.setChoice3("cadsdana");
        testQuestions2.setChoice4("daddazzxcba");
        testQuestions2.setQuestionAnswer("burtyuosa");
        testQuestionsArr.add(testQuestions2);

        testQuestions3.setQuestionString("baddddadın");
        testQuestions3.setChoice1("adaiişina");
        testQuestions3.setChoice2("ııpyttt");
        testQuestions3.setChoice3("ccffryut");
        testQuestions3.setChoice4("sadaer");
        testQuestions3.setQuestionAnswer("sadaer");
        testQuestionsArr.add(testQuestions3);

        testQuestions4.setQuestionString("adın");
        testQuestions4.setChoice1("sacada");
        testQuestions4.setChoice2("vadaca");
        testQuestions4.setChoice3("ddefere");
        testQuestions4.setChoice4("sedere");
        testQuestions4.setQuestionAnswer("sedere");
        testQuestionsArr.add(testQuestions4);

        testQuestions.setQuestionString("werete");
        testQuestions.setChoice1("vfrete");
        testQuestions.setChoice2("cadefr");
        testQuestions.setChoice3("sADEVE");
        testQuestions.setChoice4("daQQQQQQddaba");
        testQuestions.setQuestionAnswer("cadefr");
        testQuestionsArr.add(testQuestions);

        testExam.setTestQuestions(testQuestionsArr);

       //  testExam =(TestExam) getIntent().getSerializableExtra("exam");
     //   duration=Integer.parseInt(testExam.getDuration());
        number=Integer.parseInt(testExam.getNumber());
        iterhold=number-1;
      //  answers=new String[Integer.parseInt(testExam.getNumber())];


        timer.setText(testExam.getDuration());
        query.setText(testExam.getTestQuestions().get(0).getQuestionString());
        next.setText(nextString);
        back.setText(backString);
        rb1.setText(testExam.getTestQuestions().get(0).getChoice1());
        rb2.setText(testExam.getTestQuestions().get(0).getChoice2());
        rb3.setText(testExam.getTestQuestions().get(0).getChoice3());
        rb4.setText(testExam.getTestQuestions().get(0).getChoice4());
        questionNumber.setText("Question 1");
        back.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);
        iterator=0;
        StartTimer();

        for(int i=0;i<checked.length;i++){
            checked[i]=-5;
            answers[i]="null";
        }


    }


    public void back(View view) {

        if(rg.getCheckedRadioButtonId()!=-1){
            int i=rg.getCheckedRadioButtonId();
            checked[iterator]=i;
            temp=findViewById(i);
            answers[iterator] =temp.getText().toString();
        }


        iterator--;
        Log.d("iterator"," "+iterator+"number "+number);
        query.setText(testExam.getTestQuestions().get(iterator).getQuestionString());
        rb1.setText(testExam.getTestQuestions().get(iterator).getChoice1());
        rb2.setText(testExam.getTestQuestions().get(iterator).getChoice2());
        rb3.setText(testExam.getTestQuestions().get(iterator).getChoice3());
        rb4.setText(testExam.getTestQuestions().get(iterator).getChoice4());
        questionNumber.setText("Soru "+(iterator));

        if(iterator>0) { back.setVisibility(View.VISIBLE);   } else{back.setVisibility(View.INVISIBLE);}


        /*rb1.setSelected(false);
        rb2.setSelected(false);
        rb3.setSelected(false);
        rb4.setSelected(false);
*/
        rg.clearCheck();

        if (checked[iterator] != -5) {
            temp=findViewById(checked[iterator]);
            temp.setChecked(true);
            Log.d("tıklanma alındı back","ssss");
        }

    }

    public void next(View view) {




        if(rg.getCheckedRadioButtonId()!=-1){

            checked[iterator]=rg.getCheckedRadioButtonId();
            temp=findViewById(rg.getCheckedRadioButtonId());
            answers[iterator] =temp.getText().toString();
        }


        if (iterhold==iterator) {
            Log.d("iter ",""+iterator);

            Checktest(testExam, answers);
            Intent i = new Intent(this, CandidateInfo.class);
            i.putExtra("trueAns", trueAns);
            i.putExtra("falseAns", falseAns);
            i.putExtra("unAnswered", unAnswered);
            Log.d("true"," "+trueAns+"false "+falseAns+"empty "+unAnswered);

            startActivity(i); }
else{
            rg.clearCheck();
            iterator=iterator+1;

            if (iterator == iterhold) {
                next.setText(finish);

            }

            Log.d("iterator"," "+iterator+"number "+number+"hold "+iterhold);
            query.setText(testExam.getTestQuestions().get(iterator).getQuestionString());
            rb1.setText(testExam.getTestQuestions().get(iterator).getChoice1());
            rb2.setText(testExam.getTestQuestions().get(iterator).getChoice2());
            rb3.setText(testExam.getTestQuestions().get(iterator).getChoice3());
            rb4.setText(testExam.getTestQuestions().get(iterator).getChoice4());
            back.setVisibility(View.VISIBLE);
            questionNumber.setText(Question + (iterator + 1));




            if (checked[iterator] != -5) {
                temp=findViewById(checked[iterator]);
                temp.setChecked(true);
            }


        }



    }







    public void Checktest(TestExam testExam,String[] answers) {


        for (int i = 0; i < number; i++) {
            Log.d("comparing ", " answer : " + answers[i] + " real answer: " + testExam.getTestQuestions().get(i).getQuestionAnswer());


            if (!(answers[i].equals("null"))){
                if (answers[i].equals(testExam.getTestQuestions().get(i).getQuestionAnswer()))
                    trueAns++;
                if (!answers[i].equals(testExam.getTestQuestions().get(i).getQuestionAnswer()))
                    falseAns++;
            }
            else {
                unAnswered++;
            }


        }
    }

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
    Checktest(testExam, answers);
    Intent i = new Intent(this, CandidateInfo.class);
    i.putExtra("trueAns", trueAns);
    i.putExtra("falseAns", falseAns);
    i.putExtra("unAnswered", unAnswered);
    startActivity(i);
}

}
