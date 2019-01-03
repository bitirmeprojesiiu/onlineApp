package com.example.omer.onlineint.view;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.omer.onlineint.Model.Classic.ClassicExam;
import com.example.omer.onlineint.Model.Classic.ClassicResult;
import com.example.omer.onlineint.Model.ResultResponse;
import com.example.omer.onlineint.Model.Test.TestExam;
import com.example.omer.onlineint.Moduls.Moduls;
import com.example.omer.onlineint.R;

public class CandidateInfo extends AppCompatActivity {

/*
    ClassicResult texam=new ClassicResult();
    TestExam cexam=new TestExam();
    String examType;
    TestExam testExam=new TestExam();
    ClassicExam classicExam=new ClassicExam();
    EditText name,surname,tc,mail,phoneNumber;
    Button send;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_info);

/*
         name=findViewById(R.id.name);
         surname=findViewById(R.id.surname);
         tc=findViewById(R.id.tc);
         mail=findViewById(R.id.mail);
         phoneNumber=findViewById(R.id.phoneNumber);
         send=findViewById(R.id.send);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        examType = intent.getStringExtra("examtype");
        GetExamObj(examType, bundle);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             SetExam(examType);
Moduls moduls=new Moduls();
ResultResponse resultResponse=moduls.sendTR(texam);
            }});

    }






    public void GetExamObj(String examType, Bundle bundle){

        if(examType.equals("test")){
             testExam=(TestExam) bundle.getSerializable("test");

        }
        if(examType.equals("classic")){
             classicExam=(ClassicExam) bundle.getSerializable("classic");

        }

    }


    public void SetExam(String examType){

        if(examType.equals("classic")){

            texam.setName(name.getText().toString());
            texam.setSurname(surname.getText().toString());
            texam.setTcid(tc.getText().toString());
            texam.setEmail(mail.getText().toString());
            texam.setPhoneNumber(phoneNumber.getText().toString());
        }
        if(examType.equals("test")){

            cexam.setName(name.getText().toString());
            cexam.setSurname(surname.getText().toString());
            cexam.setTcid(tc.getText().toString());
            cexam.setEmail(mail.getText().toString());
            cexam.setPhoneNumber(phoneNumber.getText().toString());
        }



*/
    }
}
