package com.namlu.moneytreelite.ui.accounts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.namlu.moneytreelite.R
import com.namlu.moneytreelite.model.Account
import kotlinx.android.synthetic.main.list_item_account.view.*

class AccountsAdapter(context: Context) : RecyclerView.Adapter<AccountsAdapter.AccountsViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)

    private val _accounts = mutableListOf<Account>()

    var accounts: List<Account>
        get() = _accounts.toList()
        set(value) {
            _accounts.clear()
            _accounts.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountsViewHolder {
        return AccountsViewHolder(layoutInflater.inflate(R.layout.list_item_account, parent, false))
    }

    override fun getItemCount(): Int {
        return accounts.size
    }

    override fun onBindViewHolder(holder: AccountsViewHolder, position: Int) {
        holder.bind(accounts[position])
    }

    class AccountsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(account: Account) {
            val context = itemView.context

            itemView.tv_account_name.text = account.name
            itemView.tv_account_current_balance.text = context.getString(R.string.format_balance, account.currentBalance)
        }
    }
}