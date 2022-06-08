package com.example.datingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.adapters.IdAdapter
import com.example.datingapp.adapters.MatchesAdapter
import com.example.datingapp.databinding.FragmentMatchesBinding
import com.example.datingapp.models.IdModel
import com.example.datingapp.models.MatchesModel

class MatchesFragment : Fragment(),Baselistner {
    private lateinit var binding: FragmentMatchesBinding
    lateinit var matchesAdapter: MatchesAdapter
    var mMatches = ArrayList<MatchesModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_matches, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpMatches()
   binding.ivBackArrow.setOnClickListener(){
       callback()
   }
    }

    private fun setUpMatches() {
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        mMatches.add(MatchesModel(R.drawable.circle_img,"ali","engineer",R.drawable.love,R.drawable.close))
        binding.machesRecycler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        matchesAdapter = MatchesAdapter( mMatches)
        binding.machesRecycler.adapter = matchesAdapter

    }

    override fun fragmentChange(fragment: Fragment) {
        TODO("Not yet implemented")
    }

    override fun callback() {
        (activity as MainActivity).callback()
    }

    override fun navigate(id: Int) {
        TODO("Not yet implemented")
    }

    override fun showbottombar() {
        TODO("Not yet implemented")
    }

    override fun hiddenbottombar() {
        TODO("Not yet implemented")
    }


}