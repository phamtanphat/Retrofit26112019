package com.example.retrofit26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Set up retrofit
        Gson gson = new GsonBuilder()
                .disableHtmlEscaping()
                .setLenient()
                .create();
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                            .readTimeout(300 , TimeUnit.SECONDS)
                            .writeTimeout(300,TimeUnit.SECONDS)
                            .connectTimeout(300 , TimeUnit.SECONDS)
                            .retryOnConnectionFailure(true)
                            .protocols(Arrays.asList(Protocol.HTTP_1_1))
                            .build();

        Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://khoapham.vn/KhoaPhamTraining/json/tien/")
                            .addConverterFactory(GsonConverterFactory.create(gson))
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(okHttpClient)
                            .build();

        // 2 : Khoi tao interface chua cac request

    }
}
