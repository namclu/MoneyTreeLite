package com.namlu.moneytreelite.ui.accounts


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get

import com.namlu.moneytreelite.R

/**
 * The UI for the list of Accounts. This will show the list of Accounts and balance for each account.
 *
 */
class AccountsListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accounts_list, container, false)
    }
}
