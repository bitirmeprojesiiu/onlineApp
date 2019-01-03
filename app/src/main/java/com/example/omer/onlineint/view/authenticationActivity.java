package com.example.omer.onlineint.view;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.example.omer.onlineint.Model.CommonClass;
import com.example.omer.onlineint.Model.State;
import com.example.omer.onlineint.Moduls.Moduls;
import com.example.omer.onlineint.R;
import com.example.omer.onlineint.Retrofit.ApiClient;
import com.example.omer.onlineint.Retrofit.RestInterface;


public class authenticationActivity extends AppCompatActivity {
     CountDownTimer countDownTimer;

    private String methodType;
    EditText edUserId,edUserPassword;
    private CommonClass commonClass=new CommonClass();
boolean flag;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);


          edUserId = (EditText) findViewById(R.id.edUserId);
          edUserPassword = (EditText) findViewById(R.id.edUserPassword);

int a= 15000;
    countDownTimer=new CountDownTimer(15000,1000)//15000 kısmı kaç ms saniye olacağını gösterir.

    {
        @Override
        public void onTick(long millisUntilFinished) {
            //textView.setText(String.valueOf(millisUntilFinished/1000));
            //Milisaniyeyi 1000 e böldüğümüzde saniyeyi buluyoruz.Yani 15 saniye.
        }

        @Override
        //onFinish metodu süre bittiğinde olacak olaylar için kullanılır.
        public void onFinish() {

        }
    }.start();
    //start metodu ile ise sayacımızı başlatıyoruz.
}







    //Check internet connection
    protected boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }
    }


    public void exit(View view) {
    }




    public void check(View view) {

if(!edUserId.getText().toString().isEmpty() && !edUserPassword.getText().toString().isEmpty()){


    RestInterface restInterface=ApiClient.getClient().create(RestInterface.class);










}
else{
    Toast.makeText(this, "Tüm alanlar dolu olmalıdır", Toast.LENGTH_SHORT).show();

        }





    }



}

