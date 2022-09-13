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
import java.lang.Math.random

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
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val adapter: WorkoutListAdapter = WorkoutListAdapter()
        val rvWorkoutList = view.findViewById<RecyclerView>(R.id.rvWorkoutList)
        rvWorkoutList.adapter = adapter
        adapter.submitList(createWorkoutList())
        adapter.currentList()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun createWorkoutList() = arrayListOf<WorkoutDataModel>(
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
        WorkoutDataModel((0..180).random(), (0..100).random(), "12:48"),
    )

    companion object {
        fun newInstance() =
            HomeFragment().apply {

            }
    }
}