
package com.example.gayatrividhyaparishad
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.squareup.picasso.Picasso
import kotlin.math.log
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        val logoImage : ImageView = view.findViewById(R.id.imageView)
        val url = "https://www.gvpce.ac.in/gvp/images/logo.jpg"
        Picasso.get().load(url).into(logoImage)
        val button : Button= view.findViewById(R.id.login_button)
        button.setOnClickListener {
            val user :String = view.findViewById<EditText>(R.id.user_edit_text).text.toString()
            val password : String = view.findViewById<EditText?>(R.id.password_edit_text).text.toString()
            if(password == Mapping.rollNo[user]){
                if(!(user=="Harini")){
                    val toast="Hello $user"
                    Toast.makeText(activity ,toast, Toast.LENGTH_LONG).show()
                    findNavController().navigate(R.id.action_homeFragment_to_departmentFragment)
                }
                else{
                    val toast="Hello $user madam !!!"
                    Toast.makeText(activity ,toast, Toast.LENGTH_LONG).show()
                    findNavController().navigate(R.id.action_homeFragment_to_adminFragment)
                }
            }
        }
        return  view
    }
}