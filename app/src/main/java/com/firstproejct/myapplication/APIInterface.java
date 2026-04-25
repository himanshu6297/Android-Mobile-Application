package com.firstproejct.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("/show.php")
    Call<ResultCategory>getlist();
}
