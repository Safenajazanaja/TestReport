package com.example.testreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mTestAdapter= TestAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adt = ConcatAdapter(
            mTestAdapter,
        )
        recylerView.apply {
            layoutManager=LinearLayoutManager(baseContext)

            adapter=adt
        }

        val testResponse=TestResponse(
            data1 = 2,
            data2 = 102,
        )

        mTestAdapter.submitData(testResponse)
    }
}