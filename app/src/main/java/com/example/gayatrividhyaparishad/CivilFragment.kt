package com.example.gayatrividhyaparishad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CivilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_civil, container, false)
        val teacherList : ArrayList<Teachers> = ArrayList()
        val recyclerView : RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val teacherAdapter = CivilAdapter(teacherList)
        recyclerView.adapter= teacherAdapter
        recyclerView.setHasFixedSize(true)

        teacherList.add(Teachers(R.string.one0,R.string.two0,R.string.mining))
        teacherList.add(Teachers(R.string.one1,R.string.two1,R.string.mining))
        teacherList.add(Teachers(R.string.one2,R.string.two2,R.string.mining))
        teacherList.add(Teachers(R.string.one3,R.string.two3,R.string.mining))
        teacherList.add(Teachers(R.string.one4,R.string.two4,R.string.mining))
        teacherList.add(Teachers(R.string.one5,R.string.two5,R.string.mining))
        teacherList.add(Teachers(R.string.one6,R.string.two6,R.string.mining))
        teacherList.add(Teachers(R.string.one7,R.string.two7,R.string.mining))
        teacherList.add(Teachers(R.string.one8,R.string.two8,R.string.mining))
        teacherList.add(Teachers(R.string.one9,R.string.two9,R.string.mining))
        teacherList.add(Teachers(R.string.one10,R.string.two10,R.string.mining))
        teacherList.add(Teachers(R.string.one11,R.string.two11,R.string.mining))
        teacherList.add(Teachers(R.string.one12,R.string.two12,R.string.mining))
        teacherList.add(Teachers(R.string.one13,R.string.two13,R.string.mining))
        teacherList.add(Teachers(R.string.one14,R.string.two14,R.string.mining))
        teacherList.add(Teachers(R.string.one15,R.string.two15,R.string.mining))
        teacherList.add(Teachers(R.string.one16,R.string.two16,R.string.mining))
        teacherList.add(Teachers(R.string.one17,R.string.two17,R.string.mining))
        teacherList.add(Teachers(R.string.one18,R.string.two18,R.string.mining))
        teacherList.add(Teachers(R.string.one19,R.string.two19,R.string.mining))
        teacherList.add(Teachers(R.string.one20,R.string.two20,R.string.mining))
        teacherList.add(Teachers(R.string.one21,R.string.two21,R.string.mining))
        teacherList.add(Teachers(R.string.one22,R.string.two22,R.string.mining))
        teacherList.add(Teachers(R.string.one23,R.string.two23,R.string.mining))
        teacherList.add(Teachers(R.string.one24,R.string.two24,R.string.mining))
        teacherList.add(Teachers(R.string.one25,R.string.two25,R.string.mining))
        teacherList.add(Teachers(R.string.one26,R.string.two26,R.string.mining))
        teacherList.add(Teachers(R.string.one27,R.string.two27,R.string.mining))
        teacherList.add(Teachers(R.string.one28,R.string.two28,R.string.mining))
        teacherList.add(Teachers(R.string.one29,R.string.two29,R.string.mining))
        teacherList.add(Teachers(R.string.one30,R.string.two30,R.string.mining))
        return  view

    }
}