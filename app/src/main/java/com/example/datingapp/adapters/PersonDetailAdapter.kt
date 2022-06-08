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
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class PersonDetailAdapter( val mPersonDetails: ArrayList<PersonDetailsModel>) :
    RecyclerView.Adapter<PersonDetailAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iv_girl4: ImageView = itemView.findViewById(R.id.iv_girl4)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_person_details, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mPersonDetails[position]

        holder.iv_girl4.setImageResource(data.iv_girl4)


    }

    override fun getItemCount(): Int {
        return mPersonDetails.size
    }
}