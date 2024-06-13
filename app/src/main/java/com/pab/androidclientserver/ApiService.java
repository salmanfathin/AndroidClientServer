package com.pab.androidclientserver;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    @POST("insert_user.php")
    Call<Void> insertUser(@Body User user);

    @GET("get_users.php")
    Call<List<User>> getUsers();
    @PUT("update_user.php")
    Call<Void> updateUser(@Body User user);

    @DELETE("delete_user.php/{id}")
    Call<Void> deleteUser(@Path("id") int id);




}
