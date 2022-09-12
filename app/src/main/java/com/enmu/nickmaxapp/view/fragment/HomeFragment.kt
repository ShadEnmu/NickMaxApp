package com.enmu.nickmaxapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enmu.nickmaxapp.R
import com.enmu.nickmaxapp.adapter.WorkoutListAdapter
import com.enmu.nickmaxapp.databinding.FragmentHomeBinding
import com.enmu.nickmaxapp.model.WorkoutDataModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter: WorkoutListAdapter = WorkoutListAdapter()
        val rvWorkoutList = view.findViewById<RecyclerView>(R.id.rvWorkoutList)
        rvWorkoutList.adapter = adapter
        adapter.show(createWorkoutList())
    }

    fun createWorkoutList() = arrayListOf<WorkoutDataModel>(
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something"),
        WorkoutDataModel(1, 2, "something")
    )

    companion object {
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {

            }
    }
}