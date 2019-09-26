package com.example.tryagain01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabcontents:TabLayout=findViewById(R.id.tab_layout)
        tabcontents.addTab(tabcontents.newTab().setText("Tab1"))
        tabcontents.addTab(tabcontents.newTab().setText("Tab2"))
        tabcontents.addTab(tabcontents.newTab().setText("Tab3"))

    }

}
