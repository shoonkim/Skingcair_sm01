package com.shoonkim.kingcair_sm01.ui.product

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.shoonkim.kingcair_sm01.R
import com.shoonkim.kingcair_sm01.data.Item
import com.shoonkim.kingcair_sm01.data.ItemAdapter
import kotlinx.android.synthetic.main.tl_fragment_tab.*

class FragmentEyeLash : FragmentProductTab() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val itemList = arrayListOf(
            Item("EL001","Eye Lash 상품1", R.drawable.item_sample_img, "Eye Lash 상품1 설명", 100000, "75ML", "EA",1000 ),
            Item("EL002","Eye Lash 상품2", R.drawable.item_sample_img, "Eye Lash 상품2 설명", 200000, "3종","SET", 10000 ),
            Item("EL003","Eye Lash 상품3", R.drawable.item_sample_img, "Eye Lash 상품3 설명", 300000, "10EA", "PG", 2000 ),
            Item("EL004","Eye Lash 상품4", R.drawable.item_sample_img, "Eye Lash 상품4 설명", 400000, "100M", "EA", 34000 ),
            Item("EL005","Eye Lash 상품5", R.drawable.item_sample_img, "Eye Lash 상품5 설명", 500000, "1000ML", "EA", 20 )
        )

        rv_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_item.setHasFixedSize(true)
        rv_item.adapter = activity?.supportFragmentManager?.let { ItemAdapter(itemList, it) }
    }
}