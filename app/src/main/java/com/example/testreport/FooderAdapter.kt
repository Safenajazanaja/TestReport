package com.example.testreport

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_footer.view.*


class FooderAdapter: SingleRecyclerView<TestResponse>() {
    override fun getLayout(): Int =R.layout.item_footer
    override fun View.onBindViewHolder(data: TestResponse?) {
        tvData1.text="รวมจำนวนผู้เล่น${data?.data1}คน"

        tvData2.text="รวมคะแนน${data?.data2}"
    }


}