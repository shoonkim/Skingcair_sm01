package com.shoonkim.kingcair_sm01.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.shoonkim.kingcair_sm01.R
import com.shoonkim.kingcair_sm01.ui.DialogProductExplan

class ItemAdapter(val itemList:ArrayList<Item>, fragmentManager: FragmentManager) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private var mFragmentManager : FragmentManager = fragmentManager

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val item_code = itemList.get(curPos).item_code
                Toast.makeText(parent.context, "상품 코드 : ${item_code}", Toast.LENGTH_SHORT).show()

                val transaction = mFragmentManager.beginTransaction()
                val previous = mFragmentManager.findFragmentByTag(DialogProductExplan.TAG)

                if(previous == null){
                    transaction.addToBackStack(null)
                    val dlg = DialogProductExplan()
                    transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    transaction.add(android.R.id.content, dlg, DialogProductExplan.TAG)
                        .addToBackStack(null)
                        .commit()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        holder.item_name.text = itemList[position].item_name
        holder.img.setImageResource(itemList[position].img)
        holder.sub_txt.text = itemList[position].sub_txt
        holder.price.text = String.format("%,d원", itemList[position].price)
        holder.unit.text = String.format("%s/%s", itemList[position].unit_inf, itemList[position].unit)
        holder.stock.text =String.format("수량 : %,d%s", itemList[position].stock, itemList[position].unit)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val item_name = itemView.findViewById<TextView>(R.id.tv_dpe_item_name)
        val img = itemView.findViewById<ImageView>(R.id.iv_item_img)
        val sub_txt = itemView.findViewById<TextView>(R.id.tv_item_sub)
        val price = itemView.findViewById<TextView>(R.id.tv_item_unit_price)
        val unit = itemView.findViewById<TextView>(R.id.tv_item_unit)
        val stock = itemView.findViewById<TextView>(R.id.tv_item_stock)
    }
}