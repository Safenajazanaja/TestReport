package com.example.testreport

import android.view.View
import kotlinx.android.synthetic.main.item_date.view.*


class DateAdapter : SingleRecyclerView<Pair<String, String>>() {
    override fun getLayout(): Int = R.layout.item_date
    override fun View.onBindViewHolder(data: Pair<String, String>?) {
        tvDate.text="ตั้งแต่วันที่${data?.first} ถึงวันที่${data?.second}"
    }


}