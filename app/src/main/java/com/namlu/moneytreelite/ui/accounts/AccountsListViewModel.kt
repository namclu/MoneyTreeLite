package com.namlu.moneytreelite.ui.accounts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.namlu.moneytreelite.model.Account

class AccountsListViewModel : ViewModel() {
    // The data that we need to track in the AccountsListFragment will be
    // the accounts and the balance
    private val _accounts = MutableLiveData<List<Account>>()
    val accounts: LiveData<List<Account>>
        get() = _accounts

    private val _balance = MutableLiveData<Float>()
    val balance: LiveData<Float>
        get() = _balance
}