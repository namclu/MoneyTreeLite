package com.namlu.moneytreelite.model

import com.google.gson.annotations.SerializedName

/*
* Data structure for a single Account object
*
* */
data class Account(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("institution")
    val institution: String,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("current_balance")
    val currentBalance: Float,
    @SerializedName("current_balance_in_base")
    val currentBalanceInBase: Float)