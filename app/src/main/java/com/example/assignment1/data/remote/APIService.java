package com.example.assignment1.data.remote;

import com.example.assignment1.data.model.post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({"content-Type: application/json"})
    @POST("user/login")
    Call<post> savePost(@Body post name);
}
