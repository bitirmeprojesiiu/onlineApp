package com.example.omer.onlineint.Retrofit;



import com.example.omer.onlineint.Model.Classic.ClassicExam;
import com.example.omer.onlineint.Model.Classic.ClassicResult;
import com.example.omer.onlineint.Model.ResultResponse;
import com.example.omer.onlineint.Model.State;
import com.example.omer.onlineint.Model.Test.TestExam;
import com.example.omer.onlineint.Model.Test.TestResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestInterface {

//  sınav var mı kontrolü    field YERİNE query OLABİLİR
    @GET("checkexam")
    Call<State> CheckExam(@Query("id") String id, @Query("password") String password);

    //yazılı sınav indirmek için request at
    @FormUrlEncoded
    @POST("downloadclassicexam")
    Call<ClassicExam> DlCExam(@Field("id") String examid);

    //test sınav indirmek için request at
    @FormUrlEncoded
    @POST("downloadtestexam")
    Call<TestExam> DlTExam(@Field("id") String examid);

    @FormUrlEncoded
    @POST("classicresult")
    Call<ResultResponse> sendCR(@Body ClassicResult classicResult);

    @FormUrlEncoded
    @POST("testresult")
    Call<ResultResponse> sendTR(@Body TestResult testResult);


}
