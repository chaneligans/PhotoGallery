package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "07241be946598c789ec9d9c5172b9042"

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    suspend fun fetchPhotos(): FlickrResponse
}