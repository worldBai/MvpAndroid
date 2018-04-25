package com.baymax.bai.mvpandroid.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {
    private static final String BASE_URL = "";
    private static HttpService httpService;
    private static HttpClient instance;

    public static HttpClient getInstance() {
        if (instance == null){
            instance = new HttpClient();
        }
        return instance;
    }

    private HttpClient(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5,TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        httpService = retrofit.create(HttpService.class);
    }

    public HttpService getHttpService(){
        return httpService;
    }
}
