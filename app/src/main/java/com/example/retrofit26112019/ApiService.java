package com.example.retrofit26112019;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    //https://khoapham.vn/KhoaPhamTraining/json/tien/demo1.json

    @GET("demo1.json")
    Observable<Demo1> getDataDemo1();
}
