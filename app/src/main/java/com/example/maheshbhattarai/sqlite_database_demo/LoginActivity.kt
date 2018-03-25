package com.example.maheshbhattarai.sqlite_database_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_type = intent.getStringExtra("login_type")
        Log.e("login_type",login_type)

        btn_login.setOnClickListener(View.OnClickListener {
            if (login_type.contains("Employeer")){
                val intent = Intent(this,RequirmentActivity::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this,Job_Listing::class.java)
                startActivity(intent)
            }

        })

        new_account.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

    }
}
