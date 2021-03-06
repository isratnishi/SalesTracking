package com.opus_bd.salestracking.RetrofitService;


import com.opus_bd.salestracking.Model.MessageResponse;
import com.opus_bd.salestracking.Model.ProductModel;
import com.opus_bd.salestracking.Model.SalesModel;
import com.opus_bd.salestracking.Model.SiteModel;
import com.opus_bd.salestracking.Model.UserModel;
import com.opus_bd.salestracking.Model.UserResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface RetrofitService {
    @POST("api/logincheck")
    Call<UserResponse> login(@Body UserModel userModel);

    @GET("api/getVisit/{id}")
    Call<List<SalesModel>> getvisitList(@Header("Authorization") String token, @Path("id") int id);

    @GET("api/getUser/{email}")
    Call<UserModel> getUser(@Header("Authorization") String token, @Path("email") String email);

    @POST("api/saveVisit ")
    Call<MessageResponse> saveVisit(@Header("Authorization") String token, @Body SalesModel salesModel);

    @POST("api/deleteSaleVisit/{id} ")
    Call<MessageResponse> deleteSaleVisit(@Header("Authorization") String token, @Path("id") int id);

    @POST("api/deleteSale/{id} ")
    Call<MessageResponse> deleteSale(@Header("Authorization") String token, @Path("id") int id);

    @GET("api/getSaleVisit/{id}")
    Call<List<SalesModel>> getSaleVisit(@Header("Authorization") String token, @Path("id") int id);

    @GET("api/getSiteName/{id}")
    Call<SiteModel> getSiteName(@Header("Authorization") String token, @Path("id") int id);

    @GET("api/getProductName/{id}")
    Call<ProductModel> getProductName(@Header("Authorization") String token, @Path("id") int id);
}
