package com.example.testreport

import android.view.View
import kotlinx.android.synthetic.main.item_list3.view.*

class List3Adapter:SimpleRecyclerView<List3>() {
    override fun getLayout(): Int =R.layout.item_list3

    override fun View.onBindViewHolder(currentData: List3, beforeData: List3?) {
        tvData8.text=currentData.data8
        tvData9.text=currentData.data9
        tvData10.text= currentData.data10.toString()
        tvData11.text= currentData.data11.toString()
        tvData12.text= currentData.data12.toString()
        tvData13.text= currentData.data13.toString()
        tvData14.text= currentData.data14.toString()

    }
}