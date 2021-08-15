package com.dongyang.android.boda.Introduction.Service;

import com.dongyang.android.boda.Introduction.Model.CheckSuccess;
import com.dongyang.android.boda.Introduction.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IntroService {

    // String INTRO_URL = "http://192.168.0.4";
    String INTRO_URL = "http://122.32.165.55"; // 라즈베리파이 서버


    // 로컬호스트
//    @FormUrlEncoded
//    @POST("/boda/intro/register.php")
//    Call<CheckSuccess> signUp(
//            @Field("id") String id,
//            @Field("pw") String pw,
//            @Field("name") String name,
//            @Field("number") String number,
//            @Field("email") String email,
//            @Field("sos") String sos
//    );
//
//    @GET("/boda/intro/login.php")
//    Call<User> login(
//            @Query("id") String id,
//            @Query("pw") String pw
//    );
//
//    @GET("/boda/intro/idValidate.php")
//    Call<CheckSuccess> idValidate(
//            @Query("id") String id
//    );


    // 라즈베리파이 서버
    @FormUrlEncoded
    @POST("/android/intro/register.php")
    Call<CheckSuccess> signUp(
            @Field("id") String id,
            @Field("pw") String pw,
            @Field("name") String name,
            @Field("number") String number,
            @Field("email") String email,
            @Field("sos") String sos
    );

    @GET("/android/intro/login.php")
    Call<User> login(
            @Query("id") String id,
            @Query("pw") String pw
    );

    @FormUrlEncoded
    @GET("/android/intro/idValidate.php")
    Call<CheckSuccess> idValidate(
            @Query("id") String id
    );
}
