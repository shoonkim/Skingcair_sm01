package com.shoonkim.kingcair_sm01.ui.product

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PageAdapterProduct(fm:FragmentManager) : FragmentStatePagerAdapter(fm) {

    private var fragments : ArrayList<FragmentProductTab> = ArrayList()

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    fun addFragment(fragment : FragmentProductTab){
        fragments.add(fragment)
    }
}