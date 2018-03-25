package com.example.maheshbhattarai.sqlite_database_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_company.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("login_type", "Employeer")
            startActivity(intent)
        })

        btn_jobSeeker.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("login_type", "Job Seeker")
            startActivity(intent)
        })

    }
}
