package com.preethzcodez.ecommerceexample.webservice;

import com.preethzcodez.ecommerceexample.pojo.ResponseJSON;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Maruf Shaikh on 05/10/20
 */

public interface RetrofitInterface {

    // Method To Fetch Data From URL
    //@GET("data.json?alt=media&token=d80325f9-738c-4942-9b90-7287293ee8ef")
    @GET("data.json?alt=media&token=768e00bb-9b8c-4967-b733-1a44001c4120")
    //@GET("data.json")
    Call<ResponseJSON> fetchData();
}
