package com.spacex.features.launches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.spacex.app.BaseVBFragment
import com.spacex.databinding.FragmentLaunchesListBinding
import com.spacex.ui.observeResourceLoading
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LaunchesListFragment: BaseVBFragment<FragmentLaunchesListBinding>() {

    val launchesAdapter=LaunchesAdapter{
        val directions=LaunchesListFragmentDirections.actionLaunchesListFragmentToRocketDetailsFragment(it.rocket.orEmpty())
        findNavController().navigate(directions)
    }

    val categoriesAdapter=CategoriesAdapter()

    private val viewModel by viewModels<LaunchesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLaunchesListBinding.inflate(inflater, container, false)
        return requireBinding().root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        bindData()
        viewModel.getLaunches()
        fillCategories()
        setupBigLaunch()
    }

    fun fillCategories()
    {
        val data= listOf("Gold","Space Ships")
        categoriesAdapter.items.clear()
        if (data.isNotEmpty()) {
            categoriesAdapter.items.addAll(data)
        }
        categoriesAdapter.notifyDataSetChanged()
    }

    private fun bindData() {
        observeResourceLoading(viewModel.launchesData) { data ->
            launchesAdapter.items.clear()
            if (data.isNotEmpty()) {
                launchesAdapter.items.addAll(data)
            }
            launchesAdapter.notifyDataSetChanged()
        }
    }

    fun initRecyclerView()
    {
        requireBinding().launchesRv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        requireBinding().launchesRv.adapter = launchesAdapter
        requireBinding().launchesRv.isNestedScrollingEnabled=false

        requireBinding().categoriesRv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        requireBinding().categoriesRv.adapter = categoriesAdapter
    }

    fun setupBigLaunch()
    {
        requireBinding().bgdImage.setImageURI("https://live.staticflickr.com/7911/32652060737_4be1171d4a_o.jpg")
        requireBinding().image.setImageURI("https://live.staticflickr.com/7911/32652060737_4be1171d4a_o.jpg")
    }

}