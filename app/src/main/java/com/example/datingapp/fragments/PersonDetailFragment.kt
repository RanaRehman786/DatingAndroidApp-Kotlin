package com.example.datingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.adapters.PersonDetailAdapter
import com.example.datingapp.databinding.FragmentPersonDetailBinding
import com.example.datingapp.models.PersonDetailsModel

class PersonDetailFragment : Fragment(),Baselistner {
    private lateinit var binding: FragmentPersonDetailBinding

    lateinit var personDetailAdapter: PersonDetailAdapter
    var mPersonDetails= ArrayList<PersonDetailsModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_person_detail, container, false)
        binding.ivlike.setOnClickListener(){
           findNavController().navigate(R.id.action_personDetailFragment_to_matchesFragment)
        }
        binding.tvSeeAll.setOnClickListener(){
            findNavController().navigate(R.id.action_personDetailFragment_to_galleryFragment)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpPersonalDetails()
      binding.ivBackArrow.setOnClickListener(){
          callback()
      }
    }

    override fun onResume() {
        hiddenbottombar()
        super.onResume()
    }
    private fun setUpPersonalDetails() {
        mPersonDetails.add(PersonDetailsModel(R.drawable.girl))
        mPersonDetails.add(PersonDetailsModel(R.drawable.girl4))
        mPersonDetails.add(PersonDetailsModel(R.drawable.circle_img))
        mPersonDetails.add(PersonDetailsModel(R.drawable.girl4))
        mPersonDetails.add(PersonDetailsModel(R.drawable.girl))
        mPersonDetails.add(PersonDetailsModel(R.drawable.girl4))
        binding.personalDeatailRecycler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        personDetailAdapter = PersonDetailAdapter( mPersonDetails)
        binding.personalDeatailRecycler.adapter = personDetailAdapter
    }

    override fun fragmentChange(fragment: Fragment) {
        TODO("Not yet implemented")
    }

    override fun callback() {
        ( activity as MainActivity ).callback()
    }

    override fun navigate(id: Int) {
        TODO("Not yet implemented")
    }

    override fun showbottombar() {
    }

    override fun hiddenbottombar() {
        (activity as MainActivity).hiddenbottombar()
    }
}