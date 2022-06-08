package com.example.datingapp.adapters

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.R
import com.example.datingapp.fragments.PersonDetailFragment
import com.example.datingapp.models.PersonDetailsModel
import com.example.datingapp.models.VedioModel
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class VedioAdapter(val mVedio: ArrayList<VedioModel>) :
    RecyclerView.Adapter<VedioAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ply_btn: ImageView = itemView.findViewById(R.id.ply_btn)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_vedios, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mVedio[position]

           holder.ply_btn.setImageResource(data.ply_btn)


    }

    override fun getItemCount(): Int {
        return mVedio.size
    }
}