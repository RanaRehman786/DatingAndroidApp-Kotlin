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
import androidx.appcompat.view.menu.MenuView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.R
import com.example.datingapp.fragments.PersonDetailFragment
import com.example.datingapp.models.IdModel
import com.example.datingapp.models.MessageModel
import com.example.datingapp.models.PersonDetailsModel
import com.example.datingapp.models.VedioModel
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import java.nio.file.Files.find

class MessageAdapter(var callback:(item:String)->Unit) :
    RecyclerView.Adapter<MessageAdapter.ViewHolder>() {
    lateinit var context: Context
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cl_message_item:ConstraintLayout=itemView.findViewById(R.id.cl_message_item)
        val ci_message: ImageView = itemView.findViewById(R.id.ci_message)
        val tv_msg_name: TextView = itemView.findViewById(R.id.tv_msg_name)
        val tv_msg_disc: TextView = itemView.findViewById(R.id.tv_msg_disc)
        val tv_msg_time: TextView = itemView.findViewById(R.id.tv_msg_time)

    }
    var mMessage:ArrayList<MessageModel> = arrayListOf()
    fun setdata(list:ArrayList<MessageModel>){
        mMessage=list
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context=parent.context
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mMessage[position]
        holder.ci_message.setImageResource(data.ci_message)
        holder.tv_msg_name.text = data.tv_msg_name
        holder.tv_msg_disc.text = data.tv_msg_disc
        holder.tv_msg_time.text = data.tv_msg_time
        holder.cl_message_item.setOnClickListener() {
            callback.invoke(data.tv_msg_name)
        }


    }

    override fun getItemCount(): Int {
        return mMessage.size
    }
}