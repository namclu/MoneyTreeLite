package com.namlu.moneytreelite.model

/*
* Data structure for a single Account object
*
* */
data class Account(
    val id: Int,
    val name: String,
    val institution: String,
    val currency: String,
    val currentBalance: Float,
    val currentBalanceInBase: Float)