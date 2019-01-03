package com.example.omer.onlineint.view;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.omer.onlineint.Model.CommonClass;
import com.example.omer.onlineint.Model.Test.TestExam;
import com.example.omer.onlineint.R;

public class ExamInfo extends AppCompatActivity {

    private Button button;
    private TextView l_format,l_number,l_duration;
    private CommonClass commonClass=new CommonClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_info);

        l_duration=(TextView)findViewById(R.id.duration);
        l_number  =(TextView)findViewById(R.id.questionNumber);
        l_format  =(TextView)findViewById(R.id.format);
          button  =(Button)findViewById(R.id.start);


        commonClass=(CommonClass) getIntent().getSerializableExtra("exam");

        if(commonClass.getTestExam()!=null){
            l_duration.setText(commonClass.getTestExam().getDuration());
            l_number.setText(commonClass.getTestExam().getNumber());
            l_format.setText(commonClass.getTestExam().getFormat());
        }
        if(commonClass.getClassicExam()!=null){
            l_duration.setText(commonClass.getClassicExam().getDuration());
            l_number.setText(commonClass.getClassicExam().getNumber());
            l_format.setText(commonClass.getClassicExam().getFormat());
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(commonClass.getExamtype().equals("test")){
                    Intent i=new Intent(ExamInfo.this,TestExam.class);
                    i.putExtra("exam",commonClass.getTestExam());
                    startActivity(i);
                }

                if(commonClass.getExamtype().equals("classic")){
                    Intent i=new Intent(ExamInfo.this,TestExam.class);
                    i.putExtra("exam",commonClass.getClassicExam());
                    startActivity(i);
                }



            }
        });
    }
}
