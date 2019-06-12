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
    val currentBalanceInBase: Float) {

    companion object {
        // Hardcoded Account object used for testing
        fun tempFactory(): Account {
            return Account(
                1,
                "外貨普通(USD)",
                "Test Bank",
                "USD",
                22.5f,
                2306.0f
            )
        }
    }
}