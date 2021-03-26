package com.example.testreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mfoodAdapter = FooderAdapter()
    private val mList1 = List1Adapter()
    private val mDateAdapter = DateAdapter()
    private val mColumAdapter = ColumAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adt = ConcatAdapter(
            mDateAdapter, mColumAdapter, mList1, mfoodAdapter
        )
        recylerView.apply {
            layoutManager = LinearLayoutManager(baseContext)

            adapter = adt
        }

        val testResponse = TestResponse(
            data1 = 2,
            data2 = 102,
            list1 = listOf(
                List1(
                    data3 = "P01",
                    data4 = "Mr.A",
                    data5 = 2,
                    data6 = 54,
                    list2 = listOf(
                        List2(
                            data7 = 24,
                            list3 = listOf(
                                List3(
                                    data8 = "1/1/64",
                                    data9 = "8:00",
                                    data10 = 5,
                                    data11 = 4,
                                    data12 = 0,
                                    data13 = 12,
                                    data14 = 21,
                                ),
                                List3(
                                    data8 = "1/1/64",
                                    data9 = "10:00",
                                    data10 = 3,
                                    data11 = 0,
                                    data12 = 0,
                                    data13 = 0,
                                    data14 = 3,
                                ),
                            )
                        ),
                        List2(
                            data7 = 54,
                            list3 = listOf(
                                List3(
                                    data8 = "2/1/64",
                                    data9 = "7:00",
                                    data10 = 1,
                                    data11 = 2,
                                    data12 = 3,
                                    data13 = 4,
                                    data14 = 10,
                                ),
                                List3(
                                    data8 = "2/1/64",
                                    data9 = "12:00",
                                    data10 = 2,
                                    data11 = 4,
                                    data12 = 6,
                                    data13 = 8,
                                    data14 = 20,
                                ),
                            )
                        ),
                    )
                ),
                List1(
                    data3 = "P02",
                    data4 = "Mr.B",
                    data5 = 1,
                    data6 = 48,
                    list2 = listOf(
                        List2(
                            data7 = 48,
                            list3 = listOf(
                                List3(
                                    data8 = "2/1/64",
                                    data9 = "15:00",
                                    data10 = 1,
                                    data11 = 6,
                                    data12 = 11,
                                    data13 = 0,
                                    data14 = 18,
                                ),
                                List3(
                                    data8 = "2/1/64",
                                    data9 = "20:00",
                                    data10 = 5,
                                    data11 = 8,
                                    data12 = 9,
                                    data13 = 8,
                                    data14 = 30,
                                ),
                            )
                        ),
                    )
                ),
            )
        )
        mDateAdapter.submitData(Pair("1/1/64", "2/1/64"))
        mColumAdapter.submitData(Unit)
        mList1.submitList(testResponse.list1)

        mfoodAdapter.submitData(testResponse)
    }
}