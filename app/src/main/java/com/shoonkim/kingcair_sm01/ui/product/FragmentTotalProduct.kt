package com.shoonkim.kingcair_sm01.ui.product

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.shoonkim.kingcair_sm01.R
import com.shoonkim.kingcair_sm01.data.Item
import com.shoonkim.kingcair_sm01.data.ItemAdapter
import kotlinx.android.synthetic.main.tl_fragment_tab.*

class FragmentTotalProduct:FragmentProductTab() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val itemList = arrayListOf(
            Item("T001","전체상품1", R.drawable.item_sample_img, "전체상품1 설명", 100000, "75ML", "EA",1000 ),
            Item("T002","전체상품2", R.drawable.item_sample_img, "전체상품2 설명", 200000, "3종","SET", 10000 ),
            Item("T003","전체상품3", R.drawable.item_sample_img, "전체상품3 설명", 300000, "10EA", "PG", 2000 ),
            Item("T004","전체상품4", R.drawable.item_sample_img, "전체상품4 설명", 400000, "100M", "EA", 34000 ),
            Item("T005","전체상품5", R.drawable.item_sample_img, "전체상품5 설명", 500000, "1000ML", "EA", 20 )
        )

        rv_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_item.setHasFixedSize(true)
        rv_item.adapter = activity?.supportFragmentManager?.let { ItemAdapter(itemList, it) }
    }
}