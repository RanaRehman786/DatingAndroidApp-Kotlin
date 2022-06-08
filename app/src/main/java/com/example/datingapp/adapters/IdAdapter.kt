package com.example.datingapp.adapters

import android.content.Context
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
import com.example.datingapp.fragments.HomeFragment
import com.example.datingapp.models.IdModel
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class IdAdapter(var callback:(item:String)->Unit) :
    RecyclerView.Adapter<IdAdapter.ViewHolder>() {
    lateinit var context: Context
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iv_id_dp: ImageView =itemView.findViewById(R.id.iv_id_dp)
        val tv_id_name: TextView = itemView.findViewById(R.id.tv_id_name)
        val iv_location: ImageView =itemView.findViewById(R.id.iv_location)
        val tv_km: TextView = itemView.findViewById(R.id.tv_km)
        val tv_spec: TextView = itemView.findViewById(R.id.tv_spec)
        val ivcross: ImageView =itemView.findViewById(R.id.ivcross)
        val iv_heart: ImageView =itemView.findViewById(R.id.iv_heart)
    }
    var mId:ArrayList<IdModel> = arrayListOf()
    fun setdata(list:ArrayList<IdModel>){
        mId=list
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context=parent.context
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.id_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mId[position]

        holder.iv_id_dp.setImageResource(data.iv_id_dp)
        holder.tv_id_name.text=data.tv_id_name
        holder.iv_location.setImageResource(data.iv_location)
        holder.tv_km.text=data.tv_km
        holder.tv_spec.text=data.tv_spec
        holder.ivcross.setImageResource(data.ivcross)
        holder.iv_heart.setImageResource(data.iv_heart)
        holder.iv_id_dp.setOnClickListener(){
            callback.invoke(data.tv_id_name)
        }

    }

    override fun getItemCount(): Int {
        return mId.size
    }
}