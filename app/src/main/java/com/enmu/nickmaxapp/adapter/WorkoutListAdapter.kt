package com.enmu.nickmaxapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.enmu.nickmaxapp.R
import com.enmu.nickmaxapp.model.WorkoutDataModel
import androidx.recyclerview.widget.AsyncListDiffer
import com.enmu.nickmaxapp.core.WorkoutDiffCallback

class WorkoutListAdapter : RecyclerView.Adapter<WorkoutListAdapter.WorkoutListViewHolder>() {

    private val asyncDiffer : AsyncListDiffer<WorkoutDataModel> = AsyncListDiffer(this, WorkoutDiffCallback())

    fun submitList(list: List<WorkoutDataModel>) {
        asyncDiffer.submitList(list)
    }

    fun currentList(): List<WorkoutDataModel> {
        return asyncDiffer.currentList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.workout_list_item, parent, false)
        return  WorkoutListViewHolder(view)
    }

    override fun onBindViewHolder(holder: WorkoutListViewHolder, position: Int) {
        holder.bind(asyncDiffer.currentList[position])
    }

    override fun getItemCount(): Int {
        return asyncDiffer.currentList.size
    }


    inner class WorkoutListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvAngle = view.findViewById<TextView>(R.id.tvAngle)
        private val tvPercent = view.findViewById<TextView>(R.id.tvPercent)
        private val tvTime = view.findViewById<TextView>(R.id.tvTime)
        fun bind(model: WorkoutDataModel) {
            model.map(tvAngle, tvPercent, tvTime)
        }
    }
}
