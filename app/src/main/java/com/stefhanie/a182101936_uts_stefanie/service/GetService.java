package com.stefhanie.a182101936_uts_stefanie.service;

import com.stefhanie.a182101936_uts_stefanie.model.User;
import com.stefhanie.a182101936_uts_stefanie.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
