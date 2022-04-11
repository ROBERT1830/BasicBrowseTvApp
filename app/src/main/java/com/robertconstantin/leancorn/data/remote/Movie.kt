package com.theapache64.leancorn.data.remote

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Movie(
    @Json(name = "actors")
    val actors: List<String>,
    @Json(name = "desc")
    val desc: String,
    @Json(name = "directors")
    val directors: List<String>,
    @Json(name = "genre")
    val genre: List<String>,
    @Json(name = "image_url")
    val imageUrl: String,
    @Json(name = "imdb_url")
    val imdbUrl: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "rating")
    val rating: Double,
    @Json(name = "thumb_url")
    val thumbUrl: String,
    @Json(name = "year")
    val year: Int? // 1957
) : Parcelable {
    @IgnoredOnParcel
    var categoryId: Long = -1
}