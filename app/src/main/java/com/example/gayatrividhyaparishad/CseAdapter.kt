
package com.example.gayatrividhyaparishad
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.squareup.picasso.Picasso


class CseAdapter(private val dataset: List<Teachers>) : RecyclerView.Adapter<CseAdapter.ItemViewHolder>(){


    class ItemViewHolder (itemView : View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageButton = itemView.findViewById(R.id.image)
        val textView1: TextView = itemView.findViewById(R.id.text1)
        val textView2: TextView = itemView.findViewById(R.id.text2)
        val textView3: TextView = itemView.findViewById(R.id.text3)

        init {
            itemView.setOnClickListener { v: View ->
                val view = LayoutInflater.from(itemView.context).inflate(R.layout.teacher_profile, null)
                val bottomSheet = BottomSheetDialog(itemView.context)
                bottomSheet.setContentView(view)
                bottomSheet.show()
                bottomSheet.window?.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
                    ?.let {
                        val behavior = BottomSheetBehavior.from(it)
                        behavior.peekHeight = 1600
                        behavior.maxHeight = 2000 // set the peek height here
                    }

                val b1 : Button = view.findViewById(R.id.linkedin)
                val b2 : Button = view.findViewById(R.id.resume)
                b1.setOnClickListener {
                    var s1 = ""
                    when(adapterPosition){
                        0 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.KRISHNA%20SUBBA%20RAO.pdf"
                        1 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/PROF.Dr.D.RAVI.pdf"
                        2 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/roja'sresume1.pdf"
                        3 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.ARAVIND.pdf"
                        4 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/N.V.S.LAKHMIPATHI%20RAJU.pdf"
                        5 -> s1="https://www.linkedin.com/in/dr-nagadhara-harini-kanakala-737808b7/"
                        6 -> s1="https://www.gv pce.ac.in/GVP_Fac_Profiles/cse/umadevi.pdf"
                        7 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/dr.y.anuradha.pdf"
                        8 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Parthasarathi%20CV.pdf"
                        9 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Dr.%20VELUMANI%20CV.pdf"
                        10 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Sitakumari.pdf"
                        11 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Ajay.pdf"
                        12 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/it/SATYA%20KEERTHI%20GORRIPATI.pdf"
                        13 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/knr.pdf"
                        14 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/avinash.pdf"
                        15 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.SRAVYA.pdf"
                        16 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/G.V.HINDUMATHI.pdf"
                        17 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/GEETANJALI%20NAYAK.pdf"
                        18 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Ramanjaneyulu.pdf"
                        19 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Tulasi.pdf"
                        20 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Srikanth%20Varma.pdf"
                        21 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Sirisha.pdf"
                        22 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Somasekhar.pdf"
                        23 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/msnmurthy.pdf"
                        24 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/pavani[1].pdf"
                        25 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/vaniresume.pdf"
                        26 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Malli_resume.pdf"
                        27 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/beulah.pdf"
                        28 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/deepika.pdf"
                        29 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/sumasree.pdf"
                        30 -> s1="https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Pranalini.pdf"
                    }
                    val intent2 =Intent(Intent.ACTION_VIEW)
                    intent2.data = Uri.parse(s1)
                    itemView.context.startActivity(intent2)
                }
                b2.setOnClickListener {
                    var s = ""
                    when(adapterPosition) {
                        0 -> s =
                            "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.KRISHNA%20SUBBA%20RAO.pdf"
                        1 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/PROF.Dr.D.RAVI.pdf"
                        2 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/roja'sresume1.pdf"
                        3 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.ARAVIND.pdf"
                        4 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/N.V.S.LAKHMIPATHI%20RAJU.pdf"
                        5 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/harini.pdf"
                        6 -> s = "https://www.gv pce.ac.in/GVP_Fac_Profiles/cse/umadevi.pdf"
                        7 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/dr.y.anuradha.pdf"
                        8 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Parthasarathi%20CV.pdf"
                        9 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Dr.%20VELUMANI%20CV.pdf"
                        10 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Sitakumari.pdf"
                        11 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Ajay.pdf"
                        12 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/it/SATYA%20KEERTHI%20GORRIPATI.pdf"
                        13 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/knr.pdf"
                        14 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/avinash.pdf"
                        15 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/P.SRAVYA.pdf"
                        16 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/G.V.HINDUMATHI.pdf"
                        17 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/GEETANJALI%20NAYAK.pdf"
                        18 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Ramanjaneyulu.pdf"
                        19 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Tulasi.pdf"
                        20 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Srikanth%20Varma.pdf"
                        21 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Sirisha.pdf"
                        22 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Somasekhar.pdf"
                        23 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/msnmurthy.pdf"
                        24 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/pavani[1].pdf"
                        25 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/vaniresume.pdf"
                        26 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/Malli_resume.pdf"
                        27 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/beulah.pdf"
                        28 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/deepika.pdf"
                        29 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/cse/sumasree.pdf"
                        30 -> s = "https://www.gvpce.ac.in/GVP_Fac_Profiles/it/Pranalini.pdf"
                    }
                    val intent2 =Intent(Intent.ACTION_VIEW)
                    intent2.data = Uri.parse(s)
                    itemView.context.startActivity(intent2)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.cse_layout,parent,false)
        return ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item =dataset[position]
        val url = when(position){
            0 -> "https://www.gvpce.ac.in/facphotos/cse/PKSRao.jpg"
            1 -> "https://www.gvpce.ac.in/facphotos/cse/DRavi.jpg"
            2 -> "https://www.gvpce.ac.in/facphotos/it/roja.jpg"
            3 -> "https://www.gvpce.ac.in/facphotos/cse/Aravind.jpg"
            4 -> "https://www.gvpce.ac.in/facphotos/cse/NVLPRaju.jpg"
            5 -> "https://www.gvpce.ac.in/facphotos/cse/harini.JPG"
            6 -> "https://www.gvpce.ac.in/facphotos/cse/umadevi.JPG"
            7 -> "https://www.gvpce.ac.in/facphotos/cse/anuradha.JPG"
            8 -> "https://www.gvpce.ac.in/facphotos/cse/Patra.jpg"
            9 -> "https://www.gvpce.ac.in/facphotos/cse/velumani.jpg"
            10 -> "https://www.gvpce.ac.in/facphotos/it/sitakumari.jpg"
            11 -> "https://www.gvpce.ac.in/facphotos/cse/Ajay.jpg"
            12 -> "https://www.gvpce.ac.in/facphotos/it/keerthi.jpg"
            13 -> "https://www.gvpce.ac.in/facphotos/cse/knr.jpg"
            14 -> "https://www.gvpce.ac.in/facphotos/cse/avinash.jpg"
            15 -> "https://www.gvpce.ac.in/facphotos/cse/PSravya.jpg"
            16 -> "https://www.gvpce.ac.in/facphotos/cse/GVHindumathi.jpg"
            17 -> "https://www.gvpce.ac.in/facphotos/cse/Geetanjali.jpg"
            18 -> "https://www.gvpce.ac.in/facphotos/cse/Ramanjaneyulu.jpg"
            19 -> "https://www.gvpce.ac.in/facphotos/cse/Tulasi.jpg"
            20 -> "https://www.gvpce.ac.in/facphotos/it/Srikanth%20Varma.JPG"
            21 -> "https://www.gvpce.ac.in/facphotos/cse/sirisha.jpg"
            22 -> "https://www.gvpce.ac.in/facphotos/cse/Somasekhar.jpg"
            23 -> "https://www.gvpce.ac.in/facphotos/cse/msnmurthy.jpg"
            24 -> "https://www.gvpce.ac.in/facphotos/cse/pavana.jpg"
            25 -> "https://www.gvpce.ac.in/facphotos/cse/gvani.jpg"
            26 -> "https://www.gvpce.ac.in/facphotos/cse/malleswari.JPG"
            27 -> "https://www.gvpce.ac.in/facphotos/cse/beulah.jpg"
            28 -> "https://www.gvpce.ac.in/facphotos/cse/deepika.jpg"
            29 -> "https://www.gvpce.ac.in/facphotos/cse/suma%20sree.jpg"
            30 -> "https://www.gvpce.ac.in/facphotos/it/Pranalini.jpg"
            else -> {
                "https://media.geeksforgeeks.org/wp-content/uploads/20210101153155/GFGframenexus5.png"
            }
        }
        Picasso.get().load(url).into(holder.imageView)
        holder.textView1.setText(item.string1ResourceId)
        holder.textView2.setText(item.string2ResourceId)
        holder.textView3.setText(item.string3ResourceId)
    }
    override fun getItemCount()=dataset.size



}

