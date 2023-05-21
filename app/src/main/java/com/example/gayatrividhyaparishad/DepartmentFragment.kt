
package com.example.gayatrividhyaparishad
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class DepartmentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_department, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cse : Button = view.findViewById(R.id.cse)
        cse.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_cseFragment)
        }
        val ece : Button = view.findViewById(R.id.ece)
        ece.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_eceFragment)
        }
        val eee : Button = view.findViewById(R.id.eee)
        eee.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_eeeFragment)
        }
        val mech : Button = view.findViewById(R.id.mech)
        mech.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_mechFragment)
        }
        val chem : Button = view.findViewById(R.id.chem)
        chem.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_chemFragment)
        }
        val civil : Button = view.findViewById(R.id.civil)
        civil.setOnClickListener {
            findNavController().navigate(R.id.action_departmentFragment_to_civilFragment)
        }

    }
}
