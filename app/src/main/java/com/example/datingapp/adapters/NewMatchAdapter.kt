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
import com.example.datingapp.models.NewMatchModel
import com.example.datingapp.models.PersonDetailsModel
import com.example.datingapp.models.VedioModel
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class NewMatchAdapter(val mNewMatch: ArrayList<NewMatchModel>) :
    RecyclerView.Adapter<NewMatchAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ci_new_match: ImageView = itemView.findViewById(R.id.ci_new_match)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_new_matches, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mNewMatch[position]

           holder.ci_new_match.setImageResource(data.ci_new_match)


    }

    override fun getItemCount(): Int {
        return mNewMatch.size
    }
}