package com.enmu.nickmaxapp.model

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import com.enmu.nickmaxapp.core.Comparator

class WorkoutDataModel(
    private val angle: Int,
    private val techPercent: Int,
    private val time: String
) {
    fun map(tvAngle: TextView, tvPercent: TextView, tvTime: TextView) {
        tvAngle.text = angle.toString()+" °"
        tvPercent.text = techPercent.toString()+" %"
        tvTime.text = time
    }

    fun compare(workoutDataModel: WorkoutDataModel): Boolean =
        this.angle == workoutDataModel.angle || this.techPercent == workoutDataModel.techPercent ||
                this.time == workoutDataModel.time
}