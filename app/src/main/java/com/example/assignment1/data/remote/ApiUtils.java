package com.example.assignment1.data.remote;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "https://chat.promactinfo.com/api/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
