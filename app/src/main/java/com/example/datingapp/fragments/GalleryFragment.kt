package com.example.datingapp.fragments

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.datingapp.Baselistner
import com.example.datingapp.MainActivity
import com.example.datingapp.R
import com.example.datingapp.adapters.PersonDetailAdapter
import com.example.datingapp.adapters.VedioAdapter
import com.example.datingapp.databinding.FragmentGalleryBinding
import com.example.datingapp.models.PersonDetailsModel
import com.example.datingapp.models.VedioModel

class GalleryFragment : Fragment(),Baselistner {
    private lateinit var binding: FragmentGalleryBinding
    lateinit var personDetailAdapter: PersonDetailAdapter
    lateinit var vedioAdapter: VedioAdapter
    var mphotos= ArrayList<PersonDetailsModel>()
    var mvedios= ArrayList<VedioModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpGalleryphoto()
        setUpGalleryvedio()
        inItVediosViews()
        inItPhotoViews()
        binding.ivBackArrow.setOnClickListener(){
            callback()
        }
        binding.clVedios.setOnClickListener(){
            inItVediosViews()
            binding.ivVedios.setColorFilter(
                binding.ivVedios.getContext().getResources().getColor(R.color.pink),
                PorterDuff.Mode.SRC_ATOP
            )
            binding.videoLine.background = this.resources.getDrawable(R.drawable.redline)
            binding.photoLine.background = this.resources.getDrawable(R.drawable.redline1)
            binding.ivPhoto.setColorFilter(
                binding.ivPhoto.getContext().getResources().getColor(R.color.gray1),
                PorterDuff.Mode.SRC_ATOP
            )
        }
        binding.clPhoto.setOnClickListener(){
            inItPhotoViews()
            binding.ivVedios.setColorFilter(
                binding.ivVedios.getContext().getResources().getColor(R.color.gray1),
                PorterDuff.Mode.SRC_ATOP
            )
            binding.videoLine.background = this.resources.getDrawable(R.drawable.redline1)
            binding.photoLine.background = this.resources.getDrawable(R.drawable.redline)
            binding.ivPhoto.setColorFilter(
                binding.ivPhoto.getContext().getResources().getColor(R.color.pink),
                PorterDuff.Mode.SRC_ATOP
            )
        }
    }

    private fun inItPhotoViews() {
        binding.galleryVediosRecycler.visibility=View.GONE
        binding.galleryphotoRecycler.visibility=View.VISIBLE
    }

    private fun inItVediosViews() {
        binding.galleryVediosRecycler.visibility=View.VISIBLE
        binding.galleryphotoRecycler.visibility=View.GONE
    }


    private fun setUpGalleryphoto() {
        mphotos.add(PersonDetailsModel(R.drawable.girl4))
        mphotos.add(PersonDetailsModel(R.drawable.girl4))
        mphotos.add(PersonDetailsModel(R.drawable.girl4))
        mphotos.add(PersonDetailsModel(R.drawable.girl1))
        mphotos.add(PersonDetailsModel(R.drawable.girl1))
        mphotos.add(PersonDetailsModel(R.drawable.girl1))
        binding.galleryphotoRecycler.layoutManager = GridLayoutManager(requireContext(), 3)
        personDetailAdapter = PersonDetailAdapter( mphotos)
        binding.galleryphotoRecycler.adapter = personDetailAdapter
    }

    private fun setUpGalleryvedio() {
        mvedios.add(VedioModel(R.drawable.play_btn))
        mvedios.add(VedioModel(R.drawable.play_btn))
        mvedios.add(VedioModel(R.drawable.play_btn))
        mvedios.add(VedioModel(R.drawable.play_btn))
        mvedios.add(VedioModel(R.drawable.play_btn))
        mvedios.add(VedioModel(R.drawable.play_btn))
        binding.galleryVediosRecycler.layoutManager = GridLayoutManager(requireContext(), 3)
        vedioAdapter = VedioAdapter( mvedios)
        binding.galleryVediosRecycler.adapter = vedioAdapter
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





