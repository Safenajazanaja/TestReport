package com.example.testreport

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.item_list1.view.*
import kotlinx.android.synthetic.main.item_list2.view.*
import kotlinx.android.synthetic.main.item_list2.view.recyclerView

class List2Adapter : SimpleRecyclerView<List2>() {
    override fun getLayout(): Int = R.layout.item_list2

    override fun View.onBindViewHolder(currentData: List2, beforeData: List2?) {
        tvData7.text = "รวมคะแนน ${currentData.data7}"

        recyclerView.submitList(List3Adapter(),currentData.list3)

    }
}