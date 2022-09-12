package com.enmu.nickmaxapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.enmu.nickmaxapp.R
import com.enmu.nickmaxapp.model.WorkoutDataModel

class WorkoutListAdapter : RecyclerView.Adapter<WorkoutListAdapter.WorkoutListViewHolder>() {

    private var list = ArrayList<WorkoutDataModel>()

    fun show(newList : List<WorkoutDataModel>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.workout_list_item, parent, false)
        return  WorkoutListViewHolder(view)
    }

    override fun onBindViewHolder(holder: WorkoutListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class WorkoutListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: WorkoutDataModel) {
            // TODO:
        }
    }
}
