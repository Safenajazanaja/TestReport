package com.example.testreport

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_test.view.*

class TestAdapter: SingleRecyclerView<TestResponse>() {
    override fun getLayout(): Int =R.layout.item_test
    override fun View.onBindViewHolder(data: TestResponse?) {
        tvData1.text="รวมจำนวนผู้เล่น${data?.data1}คน"

        tvData2.text="รวมคะแนน${data?.data2}"
    }


}