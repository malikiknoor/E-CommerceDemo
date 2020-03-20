package com.iknoortech.e_commercedemo.connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import static com.iknoortech.e_commercedemo.utils.AppConstant.P_BASE_URL;
import static com.iknoortech.e_commercedemo.utils.AppConstant.S_BASE_URL;
import static com.iknoortech.e_commercedemo.utils.AppConstant.isLive;

public class BaseUrl {

    private static String BASE_URL = isLive ? P_BASE_URL : S_BASE_URL;

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
