package com.enmu.nickmaxapp.model

import android.widget.TextView
import java.text.SimpleDateFormat

class WorkoutDataModel(
    private val angle : Int,
    private val techPercent : Int,
    private val time : String
) {
    fun map(tvAngle : TextView, tvPercent:TextView, tvTime : TextView) {
        tvAngle.text = angle.toString()
        tvPercent.text = techPercent.toString()
        tvTime.text = time
    }
}