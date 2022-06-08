package com.example.datingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.databinding.FragmentChatBoxBinding

class ChatBoxFragment : Fragment(),Baselistner {
       lateinit var binding:FragmentChatBoxBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_chat_box, container, false)
        binding.tvAcall.setOnClickListener(){
            findNavController().navigate(R.id.action_chatBoxFragment_to_audioCallFragment)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivBackArrow.setOnClickListener(){
            callback()
        }
    }

    override fun onResume() {
        hiddenbottombar()
        super.onResume()
    }
    override fun fragmentChange(fragment: Fragment) {
        TODO("Not yet implemented")
    }

    override fun callback() {
( activity as MainActivity).callback()    }

    override fun navigate(id: Int) {
        TODO("Not yet implemented")
    }

    override fun showbottombar() {
        TODO("Not yet implemented")
    }

    override fun hiddenbottombar() {
        (activity as MainActivity).hiddenbottombar()
    }


}