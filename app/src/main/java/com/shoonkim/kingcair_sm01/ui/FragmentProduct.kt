package com.shoonkim.kingcair_sm01.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shoonkim.kingcair_sm01.R
import com.shoonkim.kingcair_sm01.ui.product.*
import kotlinx.android.synthetic.main.fragment_product.*
import kotlinx.android.synthetic.main.tl_product_custom_tab_button.view.*

class FragmentProduct: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return container?.inflate(R.layout.fragment_product)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewPage()
    }

    private fun createView(tabName: String): View{
        var tabView = LayoutInflater.from(context).inflate(R.layout.tl_product_custom_tab_button, null)

        tabView.tv_product_tab.text = tabName
        when(tabName){
            resources.getString(R.string.product_total_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_total)
                return tabView
            }
            resources.getString(R.string.product_handcare_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_handcare)
                return tabView

            }
            resources.getString(R.string.product_footcare_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_footcare)
                return tabView

            }
            resources.getString(R.string.product_nailart_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_nailart)
                return tabView

            }
            resources.getString(R.string.product_toenailcorrection_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_toenailcorrection)
                return tabView

            }
            resources.getString(R.string.product_yzone_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_yzone)
                return tabView

            }
            resources.getString(R.string.product_eyelash_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_eyelash)
                return tabView

            }
            resources.getString(R.string.product_waxing_tab_txt)->{
                tabView.iv_product_tab.setImageResource(R.drawable.product_waxing)
                return tabView
            }
            else->{
                return tabView
            }
        }
    }

    private fun initViewPage(){
        val fragTotal = FragmentTotalProduct()
        val fragHandCare = FragmentHandCare()
        val fragFootCare = FragmentFootCare()
        val fragNailArt = FragmentNailArt()
        val fragToenailCorrection = FragmentToenailCorrection()
        val fragYZone = FragmentYZone()
        val fragEyeLash = FragmentEyeLash()
        val fragWaxing = FragmentWaxing()

        fragTotal.name = resources.getString(R.string.product_total_tab_txt)
        fragHandCare.name = resources.getString(R.string.product_handcare_tab_txt)
        fragFootCare.name = resources.getString(R.string.product_footcare_tab_txt)
        fragNailArt.name = resources.getString(R.string.product_nailart_tab_txt)
        fragToenailCorrection.name = resources.getString(R.string.product_toenailcorrection_tab_txt)
        fragYZone.name = resources.getString(R.string.product_yzone_tab_txt)
        fragEyeLash.name = resources.getString(R.string.product_eyelash_tab_txt)
        fragWaxing.name = resources.getString(R.string.product_waxing_tab_txt)

        val adapter = PageAdapterProduct(childFragmentManager)
        adapter.addFragment(fragTotal)
        adapter.addFragment(fragHandCare)
        adapter.addFragment(fragFootCare)
        adapter.addFragment(fragNailArt)
        adapter.addFragment(fragToenailCorrection)
        adapter.addFragment(fragYZone)
        adapter.addFragment(fragEyeLash)
        adapter.addFragment(fragWaxing)

        vp_frag_product.adapter = adapter
        tl_frag_product.setupWithViewPager(vp_frag_product)
        tl_frag_product.getTabAt(0)?.setCustomView(createView(resources.getString(R.string.product_total_tab_txt)))
        tl_frag_product.getTabAt(1)?.setCustomView(createView(resources.getString(R.string.product_handcare_tab_txt)))
        tl_frag_product.getTabAt(2)?.setCustomView(createView(resources.getString(R.string.product_footcare_tab_txt)))
        tl_frag_product.getTabAt(3)?.setCustomView(createView(resources.getString(R.string.product_nailart_tab_txt)))
        tl_frag_product.getTabAt(4)?.setCustomView(createView(resources.getString(R.string.product_toenailcorrection_tab_txt)))
        tl_frag_product.getTabAt(5)?.setCustomView(createView(resources.getString(R.string.product_yzone_tab_txt)))
        tl_frag_product.getTabAt(6)?.setCustomView(createView(resources.getString(R.string.product_eyelash_tab_txt)))
        tl_frag_product.getTabAt(7)?.setCustomView(createView(resources.getString(R.string.product_waxing_tab_txt)))
    }
}