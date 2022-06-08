package com.example.datingapp.fragments

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.adapters.IdAdapter
import com.example.datingapp.databinding.FragmentHomeBinding
import com.example.datingapp.models.IdModel


class HomeFragment : Fragment(),Baselistner {
    private lateinit var binding: FragmentHomeBinding
    lateinit var idAdapter: IdAdapter
    var mid = ArrayList<IdModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpId()

    }

    override fun onResume() {
        showbottombar()
        super.onResume()
    }
    private fun setUpId() {
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))
        mid.add(IdModel(R.drawable.girl,"hina",R.drawable.ic_small_location,"10km","actress",R.drawable.close,R.drawable.love))

        binding.idRecycler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        idAdapter= IdAdapter {

            navigate(R.id.action_homeFragment_to_personDetailFragment)
        }
        idAdapter.setdata(mid)
        binding.idRecycler.adapter=idAdapter
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