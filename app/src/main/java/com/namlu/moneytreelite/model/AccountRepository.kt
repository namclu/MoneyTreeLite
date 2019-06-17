package com.namlu.moneytreelite.model

import android.content.Context
import com.google.gson.GsonBuilder
import java.io.BufferedReader
import java.io.InputStreamReader

class AccountRepositoryImpl(private val context: Context): IAccountRepository {
    override fun getAccounts(): List<Account> {
        val bufferedReader = BufferedReader(InputStreamReader(context.assets.open("data/accounts.json")))
        val stringBuilder = StringBuilder()
        val lines = bufferedReader.readLines()

        // Join lines into a single string for Gson to parse
        lines.forEach {
            stringBuilder.append(it)
        }

        // Parse accounts
        val gson = GsonBuilder().create()
        val accountsJson = gson.fromJson(stringBuilder.toString(), AccountJson::class.java)
        return accountsJson.accounts
    }

    // Represents a json object that is a List<Account>
    private class AccountJson(val accounts: List<Account>)
}

interface IAccountRepository {
    fun getAccounts(): List<Account>
}