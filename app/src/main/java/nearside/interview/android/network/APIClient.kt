package nearside.interview.android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object APIClient {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create()) // comment out one of these!
        .build()
}

interface API {
    //TODO retrofit interface
}