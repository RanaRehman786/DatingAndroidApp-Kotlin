package com.example.datingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.adapters.IdAdapter
import com.example.datingapp.adapters.MessageAdapter
import com.example.datingapp.adapters.NewMatchAdapter
import com.example.datingapp.adapters.VedioAdapter
import com.example.datingapp.databinding.FragmentChatBinding
import com.example.datingapp.databinding.FragmentHomeBinding
import com.example.datingapp.models.MessageModel
import com.example.datingapp.models.NewMatchModel

class ChatFragment : Fragment(),Baselistner {
    private lateinit var binding: FragmentChatBinding
   lateinit var newMatchAdapter: NewMatchAdapter
   lateinit var messageAdapter: MessageAdapter
   var mMessage=ArrayList<MessageModel>()
    var mNewMatches= ArrayList<NewMatchModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpNewMatches()
        setUpMessages()
        binding.tvSeeAll.setOnClickListener(){
            binding.messageRecycler.visibility=View.VISIBLE
        }
        binding.ivBackArrow.setOnClickListener(){
            callback()
        }
    }

    override fun onResume() {
        showbottombar()
        super.onResume()
    }
    private fun setUpMessages() {
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))
      mMessage.add(MessageModel(R.drawable.circle_img,"Hamza","Hi Hamza","10:30"))

        binding.messageRecycler.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
        messageAdapter= MessageAdapter {

            navigate(R.id.action_chatFragment_to_chatBoxFragment)
        }
        messageAdapter.setdata(mMessage)
        binding.messageRecycler.adapter=messageAdapter
    }

    private fun setUpNewMatches() {
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))
        mNewMatches.add(NewMatchModel(R.drawable.circle_img))

        binding.newMatchRecycler.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
        newMatchAdapter = NewMatchAdapter( mNewMatches)
        binding.newMatchRecycler.adapter = newMatchAdapter
    }

    override fun fragmentChange(fragment: Fragment) {
        (activity as MainActivity).fragmentChange(fragment)
    }

    override fun callback() {
        (activity as MainActivity ).callback()
    }

    override fun navigate(id: Int) {
        (activity as MainActivity ).navigate(id)
    }

    override fun showbottombar() {
        (activity as MainActivity ).showbottombar()
    }

    override fun hiddenbottombar() {
        TODO("Not yet implemented")
    }


}