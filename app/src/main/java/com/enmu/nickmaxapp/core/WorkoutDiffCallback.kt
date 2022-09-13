package com.enmu.nickmaxapp.core

import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.enmu.nickmaxapp.model.WorkoutDataModel


class WorkoutDiffCallback() : ItemCallback<WorkoutDataModel>() {

    override fun areItemsTheSame(oldItem: WorkoutDataModel, newItem: WorkoutDataModel): Boolean =
        oldItem.compare(newItem)

    override fun areContentsTheSame(oldItem: WorkoutDataModel, newItem: WorkoutDataModel): Boolean =
        oldItem.compare(newItem)
}