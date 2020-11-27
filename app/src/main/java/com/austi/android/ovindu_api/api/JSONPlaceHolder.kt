package  com.austi.android.ovindu_api.api

import  com.austi.android.ovindu_api.api.model.JSONPlaceHolderData
import retrofit2.Call
import retrofit2.http.GET

interface JSONPlaceHolder {
    @get:GET("posts")
    val getJSONAPIAt: Call<List<JSONPlaceHolderData?>?>?
}