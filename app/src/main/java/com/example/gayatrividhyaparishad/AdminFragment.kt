package com.example.gayatrividhyaparishad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class AdminFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_admin,container,false)
        val addTeacher : Button = view.findViewById(R.id.addteacher)
        val removeTeacher : Button =view.findViewById(R.id.removeteacher)
        val addStudent : Button = view.findViewById(R.id.addstudent)
        addTeacher.setOnClickListener {

        }
        removeTeacher.setOnClickListener {

        }
        addStudent.setOnClickListener {

        }
        return view;
    }



}