package com.code93.tdbm.data.model

import com.google.gson.annotations.SerializedName

data class ErrorModel(
    @SerializedName("status_message") val statusMessage: String,
    @SerializedName("status_code") val statusCode: Int,
)
