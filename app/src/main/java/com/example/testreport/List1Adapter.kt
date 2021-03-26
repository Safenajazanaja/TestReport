package com.example.testreport

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_list1.view.*

class List1Adapter:SimpleRecyclerView<List1>() {
    override fun getLayout(): Int =R.layout.item_list1

    override fun View.onBindViewHolder(currentData: List1, beforeData: List1?) {
        tvData3.text=currentData.data3
        tvData4.text=currentData.data4
        tvData5.text="รวม ${currentData.data5}วัน"
        tvData6.text="รวมคะแนน${currentData.data6}"
        val adt=List2Adapter()
        recyclerView.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=adt
        }
        adt.submitList(currentData.list2)
//
//        recyclerView.submitList(List2Adapter(),currentData.list2)
    }
}