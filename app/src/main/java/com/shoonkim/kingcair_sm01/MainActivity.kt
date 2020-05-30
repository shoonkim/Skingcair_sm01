package com.shoonkim.kingcair_sm01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shoonkim.kingcair_sm01.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private val mFragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener(this)
        btn_notice.setOnClickListener(this)
        btn_product.setOnClickListener(this)
        btn_purchase_history.setOnClickListener(this)
        btn_special_sales.setOnClickListener(this)

        btn_notice.setImageResource(R.drawable.img_btn_hit_notice)

        mFragmentManager.beginTransaction().add(R.id.fl_main, FragmentNotice()).commit()
    }

    override fun onClick(v: View?) {
         if (v != null) {
            when(v.id){
                R.id.btn_login -> {changeFragment(R.id.fl_main, FragmentLogin())
                    changeBtnImg(R.id.btn_login)}
                R.id.btn_notice -> {changeFragment(R.id.fl_main, FragmentNotice())
                    changeBtnImg(R.id.btn_notice)}
                R.id.btn_product -> {changeFragment(R.id.fl_main, FragmentProduct())
                    changeBtnImg(R.id.btn_product)}
                R.id.btn_purchase_history -> {changeFragment(R.id.fl_main, FragmentPurchaseHistory())
                    changeBtnImg(R.id.btn_purchase_history)}
                R.id.btn_special_sales -> {changeFragment(R.id.fl_main, FragmentSpecialSales())
                    changeBtnImg(R.id.btn_special_sales)}
            }
        }
    }

    private fun changeFragment(layoutId: Int, f : Fragment){
        mFragmentManager.beginTransaction().replace(layoutId, f).commit()
    }

    private fun changeBtnImg(btnId: Int){
        when(btnId){
            R.id.btn_login -> {
                btn_login.setImageResource(R.drawable.img_btn_hit_login)
                btn_notice.setImageResource(R.drawable.img_btn_notice)
                btn_product.setImageResource(R.drawable.img_btn_product)
                btn_purchase_history.setImageResource(R.drawable.img_btn_purchase_history)
                btn_special_sales.setImageResource(R.drawable.img_btn_special_sales)
            }
            R.id.btn_notice -> {
                btn_login.setImageResource(R.drawable.img_btn_login)
                btn_notice.setImageResource(R.drawable.img_btn_hit_notice)
                btn_product.setImageResource(R.drawable.img_btn_product)
                btn_purchase_history.setImageResource(R.drawable.img_btn_purchase_history)
                btn_special_sales.setImageResource(R.drawable.img_btn_special_sales)
            }
            R.id.btn_product -> {
                btn_login.setImageResource(R.drawable.img_btn_login)
                btn_notice.setImageResource(R.drawable.img_btn_notice)
                btn_product.setImageResource(R.drawable.img_btn_hit_product)
                btn_purchase_history.setImageResource(R.drawable.img_btn_purchase_history)
                btn_special_sales.setImageResource(R.drawable.img_btn_special_sales)
            }
            R.id.btn_purchase_history -> {
                btn_login.setImageResource(R.drawable.img_btn_login)
                btn_notice.setImageResource(R.drawable.img_btn_notice)
                btn_product.setImageResource(R.drawable.img_btn_product)
                btn_purchase_history.setImageResource(R.drawable.img_btn_hit_purchase_history)
                btn_special_sales.setImageResource(R.drawable.img_btn_special_sales)
            }
            R.id.btn_special_sales -> {
                btn_login.setImageResource(R.drawable.img_btn_login)
                btn_notice.setImageResource(R.drawable.img_btn_notice)
                btn_product.setImageResource(R.drawable.img_btn_product)
                btn_purchase_history.setImageResource(R.drawable.img_btn_purchase_history)
                btn_special_sales.setImageResource(R.drawable.img_btn_hit_special_sales)
            }
        }
    }
}

