package com.apidemo.webservices;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHandler {
    private static final long HTTP_TIMEOUT = 30000;
    private static APIInterface apiService;
    private static String BaseURL="YOUR BASE URL HERE";

    public static APIInterface getApiService() {
        if (apiService == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
                    .connectTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
                    .addInterceptor(interceptor).build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();

            apiService = retrofit.create(APIInterface.class);
            return apiService;
        } else {
            return apiService;
        }
    }
}
