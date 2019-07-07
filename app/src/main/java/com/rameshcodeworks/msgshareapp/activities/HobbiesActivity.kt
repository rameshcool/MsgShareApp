package com.rameshcodeworks.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.rameshcodeworks.msgshareapp.R
import com.rameshcodeworks.msgshareapp.adapters.HobbiesAdapter
import com.rameshcodeworks.msgshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*


class HobbiesActivity: AppCompatActivity() {

    companion object {

        val TAG: String = HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter

    }
}