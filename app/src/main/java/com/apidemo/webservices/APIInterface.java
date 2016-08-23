package com.apidemo.webservices;

import com.apidemo.pojo.StaticPages;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface APIInterface {

    @FormUrlEncoded
    @POST("api/")
    Call<StaticPages> staticPagesApi(@FieldMap HashMap<String, String> requestBody);
}
