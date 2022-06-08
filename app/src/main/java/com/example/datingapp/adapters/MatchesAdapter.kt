package com.example.datingapp.adapters

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.R
import com.example.datingapp.adapters.MatchesAdapter.ViewHolder
import com.example.datingapp.fragments.HomeFragment
import com.example.datingapp.models.IdModel
import com.example.datingapp.models.MatchesModel
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MatchesAdapter(val mMatches: ArrayList<MatchesModel>) :
    RecyclerView.Adapter<ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cr_person_img: ImageView =itemView.findViewById(R.id.cr_person_img)
        val person_name: TextView = itemView.findViewById(R.id.person_name)
        val tv_discription: TextView = itemView.findViewById(R.id.tv_discription)
        val iv_love: ImageView =itemView.findViewById(R.id.iv_love)
        val ic_cross: ImageView =itemView.findViewById(R.id.ic_cross)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_matches, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mMatches[position]


        holder.cr_person_img.setImageResource(data.cr_person_img)
        holder.person_name.text=data.person_name
        holder.tv_discription.text=data.tv_discription
        holder.iv_love.setImageResource(data.iv_love)
        holder.ic_cross.setImageResource(data.ic_cross)
    }

    override fun getItemCount(): Int {
        return mMatches.size
    }
}

