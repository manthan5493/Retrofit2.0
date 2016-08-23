package com.apidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.apidemo.pojo.StaticPages;
import com.apidemo.webservices.ApiHandler;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView tvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tvPage = (TextView) findViewById(R.id.tvPage);

        Call<StaticPages> call = ApiHandler.getApiService().staticPagesApi(getParams());
        call.enqueue(new Callback<StaticPages>() {
            @Override
            public void onResponse(Call<StaticPages> call, Response<StaticPages> response) {
                StaticPages resData = response.body();
                if (resData != null) {
                    if (resData.getSuccess()) {
                        toolbar.setTitle(resData.getPageTitle());
                        tvPage.setText(resData.getPageDescription());
                    }
                }
            }

            @Override
            public void onFailure(Call<StaticPages> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private HashMap<String, String> getParams() {
        HashMap<String, String> param = new HashMap<>();
        param.put("action", "static_pages");
        param.put("page_slug", "Privacy-Policy");

        return param;
    }
}
