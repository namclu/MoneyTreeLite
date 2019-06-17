package com.namlu.moneytreelite.ui.accounts


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.namlu.moneytreelite.R
import kotlinx.android.synthetic.main.fragment_accounts_list.*

/**
 * The UI for the list of Accounts. This will show the list of Accounts and balance for each account.
 *
 */
class AccountsListFragment : Fragment() {
    private lateinit var accountsListViewModel: AccountsListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accounts_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Initialise the ViewModel instance
        accountsListViewModel = ViewModelProviders.of(this).get(AccountsListViewModel::class.java)

        accountsListViewModel.accounts.observe(this, Observer {
            // When accounts changes, this Observer will be invoked
            println(it)
        })

        accountsListViewModel.balance.observe(this, Observer {
            // When balance changes, this Observer will be invoked
            tv_balance_summary.text = getString(R.string.format_balance, it)
        })
    }
}
