package com.shoonkim.kingcair_sm01.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shoonkim.kingcair_sm01.R
import com.shoonkim.kingcair_sm01.ui.inflate

open class FragmentProductTab: Fragment() {

    var name = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.tl_fragment_tab)
    }
}