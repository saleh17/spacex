package com.spacex.features.rocket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.spacex.app.BaseFragment
import com.spacex.app.BaseVBFragment
import com.spacex.data.Resource
import com.spacex.databinding.FragmentRocketDetailsBinding
import com.spacex.ui.observeResourceLoading
import com.spacex.util.openWebsite
import com.spacex.util.share
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RocketDetailsFragment : BaseVBFragment<FragmentRocketDetailsBinding>() {

    private val rocketId by lazy { RocketDetailsFragmentArgs.fromBundle(requireArguments()).rocketId }

    private val viewModel by viewModels<RocketDetailsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRocketDetailsBinding.inflate(inflater, container, false)
        return requireBinding().root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireBinding().closeIv.setOnClickListener { findNavController().popBackStack() }

        bindData()
        viewModel.getLaunches(rocketId)
    }

    private fun bindData() {
        observeResourceLoading(viewModel.rocketData) { data ->
            requireBinding().image.setImageURI(data.flickrImages?.firstOrNull())
            requireBinding().progressBar.max = 100
            requireBinding().progressBar.progress = 50
            requireBinding().nameTv.text = data.name
            requireBinding().stagesTv.text = "${data.stages}"
            requireBinding().descriptionTv.text = data.description
            requireBinding().dateTv.text = data.firstFlight
            requireBinding().readMoreBt.setOnClickListener {
                openWebsite(data.wikipedia.orEmpty())
            }
            requireBinding().shareTv.setOnClickListener {
                share(data.wikipedia.orEmpty())
            }
        }
    }

}