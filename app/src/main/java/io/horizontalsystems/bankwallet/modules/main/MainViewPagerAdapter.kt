package io.horizontalsystems.bankwallet.modules.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.horizontalsystems.bankwallet.modules.balance.BalanceFragment
import io.horizontalsystems.bankwallet.modules.market.MarketFragment
import io.horizontalsystems.bankwallet.modules.settings.WebviewActivity5
import io.horizontalsystems.bankwallet.modules.settings.WebviewActivity6
import io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsFragment
import io.horizontalsystems.bankwallet.modules.transactions.TransactionsFragment

class MainViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment.getChildFragmentManager(), fragment.viewLifecycleOwner.lifecycle) {

    override fun getItemCount() = 5

    override fun createFragment(position: Int) = when (position) {
        0 -> MarketFragment()
        1 -> BalanceFragment()
        2 -> WebviewActivity5()
        3 -> WebviewActivity6()
        4 -> MainSettingsFragment()
        else -> throw IllegalStateException()
    }
}
