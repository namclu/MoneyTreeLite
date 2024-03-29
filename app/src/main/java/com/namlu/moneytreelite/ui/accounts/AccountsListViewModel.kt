package com.namlu.moneytreelite.ui.accounts

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.namlu.moneytreelite.model.Account
import com.namlu.moneytreelite.model.AccountRepositoryImpl
import com.namlu.moneytreelite.model.IAccountRepository

// AndroidViewModel receives an Application object when created
class AccountsListViewModel(app: Application) : AndroidViewModel(app) {

    // Application is also a context so we can use it in the repository
    private val repository: IAccountRepository = AccountRepositoryImpl(app)

    private val _accounts = MutableLiveData<List<Account>>().apply {
        // Todo move to background thread
        val accounts = repository.getAccounts()
        value = accounts
    }

    val accounts: LiveData<List<Account>>
        get() = _accounts

    // Transformations.map function will be triggered every time
    // accounts LiveData changes
    val balance: LiveData<Float> = Transformations.map(accounts) {
        var summedBalance = 0f

        it.forEach { account ->
            summedBalance += account.currentBalance
        }

        return@map summedBalance
    }
}