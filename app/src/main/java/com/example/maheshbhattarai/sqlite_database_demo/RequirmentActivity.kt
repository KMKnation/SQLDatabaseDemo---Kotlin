package com.example.maheshbhattarai.sqlite_database_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_requirment.*
import android.widget.TimePicker
import android.app.TimePickerDialog
import java.util.*


class RequirmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requirment)

        start_time.setOnClickListener(View.OnClickListener {
            val mcurrentTime = Calendar.getInstance()
            val hour = mcurrentTime.get(Calendar.HOUR_OF_DAY)
            val minute = mcurrentTime.get(Calendar.MINUTE)
            val mTimePicker: TimePickerDialog
            mTimePicker = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener {
                timePicker, selectedHour, selectedMinute ->
                start_time.setText(selectedHour.toString() + ":" + selectedMinute)
            }, hour, minute, true)//Yes 24 hour time
            mTimePicker.setTitle("Select Time")
            mTimePicker.show()
        })
    }
}
