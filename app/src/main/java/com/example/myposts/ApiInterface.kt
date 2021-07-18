package com.example.myposts

import org.w3c.dom.Comment
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("posts/")
    fun getPosts(): Call<List<posts>>

    @GET ("posts/{postId}")
    fun getPost(@Path("postid")id:Int):Call<posts>

    @GET("post/{postId}/comments")
    fun getComments(@Path("postId")id:Int):Call<List<comments>>
}